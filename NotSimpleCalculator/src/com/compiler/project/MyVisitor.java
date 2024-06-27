package com.compiler.project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class MyVisitor extends NotSimpleCalculatorBaseVisitor<Integer> {
    HashMap<String, Integer> map = new HashMap<>();


    @Override
    public Integer visitAssign_statement(NotSimpleCalculatorParser.Assign_statementContext ctx) {
        String ID = ctx.ID().getText();
        int value = visit(ctx.expr());
        map.put(ID, value);
        return value;
    }

    @Override
    public Integer visitBegin_end(NotSimpleCalculatorParser.Begin_endContext ctx) {
        return visit(ctx.statements());
    }

    @Override
    public Integer visitIf_then(NotSimpleCalculatorParser.If_thenContext ctx) {
        int expr = visit(ctx.expr());
        if (expr != 0) {
            return visit(ctx.statement(0));
        } else if (ctx.statement().size() > 1) {
            return visit(ctx.statement(1));
        }
        return 0;
    }

    @Override
    public Integer visitWhile_do(NotSimpleCalculatorParser.While_doContext ctx) {
        while (visit(ctx.expr()) != 0) {
            visit(ctx.statement());
        }
        return 0;
    }

    @Override
    public Integer visitFor_do(NotSimpleCalculatorParser.For_doContext ctx) {
        String ID = ctx.ID().getText();
        int start = Integer.parseInt(ctx.NUMBER(0).getText());
        int end = Integer.parseInt(ctx.NUMBER(1).getText());
        for (int i = start; i <= end; i++) {
            map.put(ID, i);
            visit(ctx.statement());
        }
        return 0;
    }

    @Override
    public Integer visitLoop_do(NotSimpleCalculatorParser.Loop_doContext ctx) {
        String ID = ctx.ID().getText();
        int num = Integer.parseInt(ctx.NUMBER().getText());
        for (int i = 0; i < num; i++) {
            map.put(ID, i);
            visit(ctx.statement());
        }
        return 0;
    }

    @Override
    public Integer visitPrint_simple(NotSimpleCalculatorParser.Print_simpleContext ctx) {
        String ID = ctx.ID().getText();
        System.out.println(ID + " is " + map.get(ID));
        return 0;
    }

    @Override
    public Integer visitPrint_literal(NotSimpleCalculatorParser.Print_literalContext ctx) {
        String literal = ctx.STRING().getText();
        String ID = ctx.ID().getText();
        System.out.println(literal + map.get(ID));
        return 0;
    }

    @Override
    public Integer visitProgram(NotSimpleCalculatorParser.ProgramContext ctx) {
        for (NotSimpleCalculatorParser.StatementContext stmt : ctx.statements().statement()) {
            visit(stmt);
        }
        return 0;
    }

    @Override
    public Integer visitStatements(NotSimpleCalculatorParser.StatementsContext ctx) {
        for (NotSimpleCalculatorParser.StatementContext stmt : ctx.statement()) {
            visit(stmt);
        }
        return 0;
    }


    @Override
    public Integer visitExpr(NotSimpleCalculatorParser.ExprContext ctx) {
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i < ctx.cumTerm().size(); i++) {
            ar.add(visit(ctx.cumTerm(i)));
        }
        if (ar.size() < 2)
            return ar.get(0);
        ctx.cumopr(); // >  <  !=  <
        boolean result = true;
        int left = ar.get(0);
        int right = ar.get(1);
        NotSimpleCalculatorParser.CumoprContext context = ctx.cumopr(0);

        switch (context.getText()) {
            case "==":
                result = left == right;
                break;
            case ">=":
                result = left >= right;
                break;
            case ">":
                result = left > right;
                break;
            case "<=":
                result = left <= right;
                break;
            case "<":
                result = left < right;
                break;
            case "!=":
                result = left != right;
                break;
        }
        return result ? 1 : 0;
    }


    @Override
    public Integer visitNumber(NotSimpleCalculatorParser.NumberContext ctx) {
        return Integer.parseInt(ctx.NUMBER().getText());
    }

    @Override
    public Integer visitIdentifier(NotSimpleCalculatorParser.IdentifierContext ctx) {
        return map.get(ctx.ID().getText());
    }

    @Override
    public Integer visitCumTerm(NotSimpleCalculatorParser.CumTermContext ctx) {
        int term = visit(ctx.term(0));

        for (int i = 1; i < ctx.term().size(); i++) {
            if (ctx.additive(i - 1).getText().equals("+")) {
                term += visit(ctx.term(i));
            } else {
                term -= visit(ctx.term(i));
            }
        }
        return term;
    }

    @Override
    public Integer visitTerm(NotSimpleCalculatorParser.TermContext ctx) {
        int factor = visit(ctx.factor(0));
        for (int i = 1; i < ctx.factor().size(); i++) {
            if (ctx.multiplicative(i - 1).getText().equals("*")) {
                factor *= visit(ctx.factor(i));
            } else if (ctx.multiplicative(i - 1).getText().equals("/")) {
                factor /= visit(ctx.factor(i));
            } else {
                factor %= visit(ctx.factor(i));
            }
        }
        return factor;
    }

    @Override
    public Integer visitFactor(NotSimpleCalculatorParser.FactorContext ctx) {
        int left;
        int right;
        Stack<Integer> stack = new Stack<>();
        for (NotSimpleCalculatorParser.ExponentContext exponent : ctx.exponent()) {
            stack.push(visit(exponent));
        }
        while (stack.size() > 1) {
            right = stack.pop();
            left = stack.pop();
            stack.push((int) Math.pow(left, right));
        }
        return stack.pop();
    }

    @Override
    public Integer visitParenthesizedExpression(NotSimpleCalculatorParser.ParenthesizedExpressionContext ctx) {
        return visit(ctx.expr());
    }


}
