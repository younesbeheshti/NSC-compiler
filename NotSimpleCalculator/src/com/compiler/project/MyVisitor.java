package com.compiler.project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class MyVisitor extends NotSimpleCalculatorBaseVisitor<String> {
    HashMap<String, Integer> map = new HashMap<>();
    StringBuilder output = new StringBuilder();

    @Override
    public String visitAssign_statement(NotSimpleCalculatorParser.Assign_statementContext ctx) {
        String ID = ctx.ID().getText();
        int value = Integer.parseInt(visit(ctx.expr()));
        map.put(ID, value);
        return null;
    }

    @Override
    public String visitBegin_end(NotSimpleCalculatorParser.Begin_endContext ctx) {
        return visit(ctx.statements());
    }

    @Override
    public String visitIf_then(NotSimpleCalculatorParser.If_thenContext ctx) {
        int expr = Integer.parseInt(visit(ctx.expr()));
        if (expr != 0) {
            return visit(ctx.statement(0));
        } else if (ctx.statement().size() > 1) {
            return visit(ctx.statement(1));
        }
        return null;
    }

    @Override
    public String visitWhile_do(NotSimpleCalculatorParser.While_doContext ctx) {
        while (Integer.parseInt(visit(ctx.expr())) != 0) {
            visit(ctx.statement());
        }
        return null;
    }

    @Override
    public String visitFor_do(NotSimpleCalculatorParser.For_doContext ctx) {
        String ID = ctx.ID().getText();
        int start = Integer.parseInt(ctx.NUMBER(0).getText());
        int end = Integer.parseInt(ctx.NUMBER(1).getText());
        for (int i = start; i <= end; i++) {
            map.put(ID, i);
            visit(ctx.statement());
        }
        return null;
    }

    @Override
    public String visitLoop_do(NotSimpleCalculatorParser.Loop_doContext ctx) {
        String ID = ctx.ID().getText();
        int num = Integer.parseInt(ctx.NUMBER().getText());
        for (int i = 0; i < num; i++) {
            map.put(ID, i);
            visit(ctx.statement());
        }
        return null;
    }

    @Override
    public String visitPrint_simple(NotSimpleCalculatorParser.Print_simpleContext ctx) {
        String ID = ctx.ID().getText();
        output.append(ID).append(" is ").append(map.get(ID)).append("\n");
        return null;
    }

    @Override
    public String visitPrint_literal(NotSimpleCalculatorParser.Print_literalContext ctx) {
        String literal = ctx.STRING().getText().replace("\"", "");
        String ID = ctx.ID().getText();
        output.append(literal).append(map.get(ID)).append("\n");
        return null;
    }

    @Override
    public String visitProgram(NotSimpleCalculatorParser.ProgramContext ctx) {
        for (NotSimpleCalculatorParser.StatementContext stmt : ctx.statements().statement()) {
            visit(stmt);
        }
        return output.toString();
    }

    @Override
    public String visitStatements(NotSimpleCalculatorParser.StatementsContext ctx) {
        for (NotSimpleCalculatorParser.StatementContext stmt : ctx.statement()) {
            visit(stmt);
        }
        return null;
    }

    @Override
    public String visitExpr(NotSimpleCalculatorParser.ExprContext ctx) {
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i = 0; i < ctx.cumTerm().size(); i++) {
            ar.add(Integer.parseInt(visit(ctx.cumTerm(i))));
        }
        if (ar.size() < 2)
            return ar.get(0).toString();
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
        return result ? "1" : "0";
    }

    @Override
    public String visitNumber(NotSimpleCalculatorParser.NumberContext ctx) {
        return ctx.NUMBER().getText();
    }

    @Override
    public String visitIdentifier(NotSimpleCalculatorParser.IdentifierContext ctx) {
        return map.get(ctx.ID().getText()).toString();
    }

    @Override
    public String visitCumTerm(NotSimpleCalculatorParser.CumTermContext ctx) {
        int term = Integer.parseInt(visit(ctx.term(0)));

        for (int i = 1; i < ctx.term().size(); i++) {
            if (ctx.additive(i - 1).getText().equals("+")) {
                term += Integer.parseInt(visit(ctx.term(i)));
            } else {
                term -= Integer.parseInt(visit(ctx.term(i)));
            }
        }
        return Integer.toString(term);
    }

    @Override
    public String visitTerm(NotSimpleCalculatorParser.TermContext ctx) {
        int factor = Integer.parseInt(visit(ctx.factor(0)));
        for (int i = 1; i < ctx.factor().size(); i++) {
            if (ctx.multiplicative(i - 1).getText().equals("*")) {
                factor *= Integer.parseInt(visit(ctx.factor(i)));
            } else if (ctx.multiplicative(i - 1).getText().equals("/")) {
                factor /= Integer.parseInt(visit(ctx.factor(i)));
            } else {
                factor %= Integer.parseInt(visit(ctx.factor(i)));
            }
        }
        return Integer.toString(factor);
    }

    @Override
    public String visitFactor(NotSimpleCalculatorParser.FactorContext ctx) {
        int left;
        int right;
        Stack<Integer> stack = new Stack<>();
        for (NotSimpleCalculatorParser.ExponentContext exponent : ctx.exponent()) {
            stack.push(Integer.parseInt(visit(exponent)));
        }
        while (stack.size() > 1) {
            right = stack.pop();
            left = stack.pop();
            stack.push((int) Math.pow(left, right));
        }
        return stack.pop().toString();
    }

    @Override
    public String visitParenthesizedExpression(NotSimpleCalculatorParser.ParenthesizedExpressionContext ctx) {
        return visit(ctx.expr());
    }
}
