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
public class CalculatorOneGUI {
    public CalculatorOneGUI() {
        JFrame t = new JFrame("Calculator");
        JPanel p  = new JPanel();
        JButton b1 = new JButton("+");
        JButton b2 = new JButton("-");
        JButton b3 = new JButton("*");
        JButton b4 = new JButton("/");
        JTextField txt = new JTextField();
        JTextField txt2 = new JTextField();
        JTextField txt3 = new JTextField();
        t.setSize(500,100);
        t.add(txt);
        t.add(txt2);
        t.add(p);
        t.add(txt3);
        txt3.setEditable(false);
        t.setLayout(new GridLayout(4,3));
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        t.pack();
        t.setVisible(true);
           
    }
    
}
