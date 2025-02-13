/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab08;

/**
 *
 * @author User
 */
import java.awt.*;
import javax.swing.*;
public class CalculatorTwoGUI {
    private JFrame fr;
    private JPanel p;
    private JTextField tf;
    private JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16;
    
    public CalculatorTwoGUI() {
        fr = new JFrame("My Calculator");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tf = new JTextField();
        p = new JPanel();
        btn1 = new JButton("7");
        btn2 = new JButton("8");
        btn3 = new JButton("9");
        btn4 = new JButton("+");
        btn5 = new JButton("4");
        btn6 = new JButton("5");
        btn7 = new JButton("6");
        btn8 = new JButton("-");
        btn9 = new JButton("1");
        btn10 = new JButton("2");
        btn11 = new JButton("3");
        btn12 = new JButton("x");
        btn13 = new JButton("0");
        btn14 = new JButton("C");
        btn15 = new JButton("=");
        btn16 = new JButton("/");
        fr.setSize(500,500);
        fr.setLayout(new GridLayout(2,1));
        fr.add(tf);
        tf.setSize(500,50);
        fr.add(p);
        p.setLayout(new GridLayout(4,4));
        p.add(btn1);
        p.add(btn2);
        p.add(btn3);
        p.add(btn4);
        p.add(btn5);
        p.add(btn6);
        p.add(btn7);
        p.add(btn8);
        p.add(btn9);
        p.add(btn10);
        p.add(btn11);
        p.add(btn12);
        p.add(btn13);
        p.add(btn14);
        p.add(btn15);
        p.add(btn16);
        fr.setVisible(true);
        
    }
}
