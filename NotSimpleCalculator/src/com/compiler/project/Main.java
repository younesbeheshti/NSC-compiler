package com.compiler.project;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Main {



        static JFrame f;
        static JButton b;
        static JTextArea jt;
        static JLabel l;


        text(){}


        public static void main(String[] args) {


                f = new JFrame("NSC-compiler");
                b = new JButton("RUN");
                l = new JLabel("Nothing Entered...");
                text te = new text();

                b.addActionListner(te);

                jt = new JTextArea(10, 10);

                JPanel p = new JPanel();

                p.add(jt);
                p.add(b);
                p.add(l);

                f.add(p);

                f.setSize(300, 300);

                f.show;

                






                // NotSimpleCalculatorLexer lexer = new NotSimpleCalculatorLexer(CharStreams.fromString("a = 2 + 3 * 4;\n" +
                //         "print \"a is \", a;\n" +
                //         "a = 2 - 1 - 1 - 1;\n" +
                //         "print \"a is \", a;\n" +
                //         "b = 8 / 2 / 2 / 2;\n" +
                //         "print \"b is \", b;\n" +
                //         "a = 2 ^ 3 ^ 2 ^ b;\n" +
                //         "print \"a is \", a;\n" +
                //         "c = 2 ^ 1 ^ 2 ^ 3;\n" +
                //         "print \"c is \", c;\n" +
                //         "d = c ^ 3 * c;\n" +
                //         "print \"d is \", d;\n" +
                //         "e = 3 ^ (3 / 3);\n" +
                //         "f = c * c ^ e * e;\n" +
                //         "print \"f is \", f;\n" +
                //         "a = 2 * 2 ^ (3 * 3);\n" +
                //         "print \"a is \", a;"));
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
                // CommonTokenStream tokens = new CommonTokenStream(lexer);
                // NotSimpleCalculatorParser parser = new NotSimpleCalculatorParser(tokens);
                // NotSimpleCalculatorParser.ProgramContext tree = parser.program();

                // MyVisitor visitor = new MyVisitor();
                // visitor.visit(tree);
        }

        public void actoinPerformed(ActionEvent e) {
                String s = e.getActionCommand();
                if(s.equals("RUN")) {
                        NotSimpleCalculatorLexer lexer = new NotSimpleCalculatorLexer(CharStreams.fromString(jt.getText()));
                        CommonTokenStream tokens = new CommonTokenStream(lexer);
                        NotSimpleCalculatorParser parser = new NotSimpleCalculatorParser(tokens);
                        NotSimpleCalculatorParser.ProgramContext tree = parser.program();

                        MyVisitor visitor = new MyVisitor();
                        // visitor.visit(tree);
                        l.setText(visitor.visit(tree));
                }
        }
}
