package com.compiler.project;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Main {

        static JFrame f;
        static JButton b;
        static JTextArea jt, jt1;

        public static class Text implements ActionListener {

                public Text() {}

                @Override
                public void actionPerformed(ActionEvent e) {
                        String s = e.getActionCommand();
                        if (s.equals("RUN")) {
                                String inputCode = jt.getText();
                                if (inputCode.isEmpty()) {
                                        jt1.setText("Nothing Entered...");
                                        return;
                                }
                                try {
                                        NotSimpleCalculatorLexer lexer = new NotSimpleCalculatorLexer(CharStreams.fromString(inputCode));
                                        CommonTokenStream tokens = new CommonTokenStream(lexer);
                                        NotSimpleCalculatorParser parser = new NotSimpleCalculatorParser(tokens);
                                        NotSimpleCalculatorParser.ProgramContext tree = parser.program();

                                        MyVisitor visitor = new MyVisitor();
                                        String result = visitor.visit(tree);
                                        jt1.setText("\n"+" "+result);
                                } catch (Exception ex) {
                                        jt1.setText("Error in processing the input.");
                                }
                        }
                }
        }

        public static void main(String[] args) {

                f = new JFrame("NSC-compiler");
                b = new JButton("RUN");
                Text te = new Text();

                b.addActionListener(te);

                jt = new JTextArea(15, 15);
                jt1 = new JTextArea(10, 10);

                jt.setBackground(Color.decode("#151a24"));
                jt.setForeground(Color.decode("#FFFFFF"));
                jt.setFont(new Font("Arial", Font.PLAIN, 15));

                jt1.setBackground(Color.decode("#151a24"));
                jt1.setForeground(Color.decode("#FFFFFF"));
                jt1.setFont(new Font("Arial", Font.PLAIN, 14));


                jt1.setEditable(false);

                JPanel p = new JPanel();
                p.setLayout(new BorderLayout());

                p.add(new JScrollPane(jt), BorderLayout.CENTER);
                p.add(b, BorderLayout.NORTH);
                p.add(jt1, BorderLayout.SOUTH);

                f.add(p);

                f.setSize(600, 500);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                f.setVisible(true);


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
                // NotSimpleCalculatorLexer lexer = new NotSimpleCalculatorLexer(CharStreams.fromString("loop a:4 do\n" +
                //         "begin\n" +
                //         "if a % 2 == 1 then\n" +
                //         "print\"a is odd: \", a;\n" +
                //         "else print \"a is even: \", a;\n" +
                //         "end"));
                // NotSimpleCalculatorLexer lexer = new NotSimpleCalculatorLexer(CharStreams.fromString("for a of 1 to 4 do\n" +
                //         "begin\n" +
                //         "if a % 2 == 1 then\n" +
                //         "print \"a is odd: \", a;\n" +
                //         "end"));
                // NotSimpleCalculatorLexer lexer = new NotSimpleCalculatorLexer((CharStreams.fromString("a = 4;\n" +
                //         "while a > 0 do\n" +
                //         "begin\n" +
                //         "if a % 2 == 1 then\n" +
                //         "print \"a is odd: \", a;\n" +
                //         "else print \"a is even: \", a;\n" +
                //         "a = a - 1;\n" +
                //         "end")));
                // CommonTokenStream tokens = new CommonTokenStream(lexer);
                // NotSimpleCalculatorParser parser = new NotSimpleCalculatorParser(tokens);
                // NotSimpleCalculatorParser.ProgramContext tree = parser.program();

                // MyVisitor visitor = new MyVisitor();
                // visitor.visit(tree);

        }
}
