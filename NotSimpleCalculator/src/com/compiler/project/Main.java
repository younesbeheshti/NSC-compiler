package com.compiler.project;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {
        public static void main(String[] args) {
                NotSimpleCalculatorLexer lexer = new NotSimpleCalculatorLexer(CharStreams.fromString("a = 2 + 3 * 4;\n" +
                        "print \"a is \", a;\n" +
                        "a = 2 - 1 - 1 - 1;\n" +
                        "print \"a is \", a;\n" +
                        "b = 8 / 2 / 2 / 2;\n" +
                        "print \"b is \", b;\n" +
                        "a = 2 ^ 3 ^ 2 ^ b;\n" +
                        "print \"a is \", a;\n" +
                        "c = 2 ^ 1 ^ 2 ^ 3;\n" +
                        "print \"c is \", c;\n" +
                        "d = c ^ 3 * c;\n" +
                        "print \"d is \", d;\n" +
                        "e = 3 ^ (3 / 3);\n" +
                        "f = c * c ^ e * e;\n" +
                        "print \"f is \", f;\n" +
                        "a = 2 * 2 ^ (3 * 3);\n" +
                        "print \"a is \", a;"));
//                NotSimpleCalculatorLexer lexer = new NotSimpleCalculatorLexer(CharStreams.fromString("loop a:4 do\n" +
//                        "begin\n" +
//                        "if a % 2 == 1 then\n" +
//                        "print\"a is odd: \", a;\n" +
//                        "else print \"a is even: \", a;\n" +
//                        "end"));
//                NotSimpleCalculatorLexer lexer = new NotSimpleCalculatorLexer(CharStreams.fromString("for a of 1 to 4 do\n" +
//                        "begin\n" +
//                        "if a % 2 == 1 then\n" +
//                        "print \"a is odd: \", a;\n" +
//                        "end"));
//                NotSimpleCalculatorLexer lexer = new NotSimpleCalculatorLexer((CharStreams.fromString("a = 4;\n" +
//                        "while a > 0 do\n" +
//                        "begin\n" +
//                        "if a % 2 == 1 then\n" +
//                        "print \"a is odd: \", a;\n" +
//                        "else print \"a is even: \", a;\n" +
//                        "a = a - 1;\n" +
//                        "end")));
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                NotSimpleCalculatorParser parser = new NotSimpleCalculatorParser(tokens);
                NotSimpleCalculatorParser.ProgramContext tree = parser.program();

                MyVisitor visitor = new MyVisitor();
                visitor.visit(tree);
        }
}
