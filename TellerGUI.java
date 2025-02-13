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
public class TellerGUI {
    private JFrame fr;
    private JLabel l1, l2;
    private JPanel p1, p2;
    private JTextField tf1, tf2;
    private JButton btn1, btn2, btn3;
    
    public TellerGUI() {
        fr = new JFrame("Teller GUI");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        l1 = new JLabel("Balance");
        l2 = new JLabel("Amount");
        
        p1 = new JPanel();
        p2 = new JPanel();
        
        tf1 = new JTextField("6000");
        tf1.setEditable(false);
        tf2 = new JTextField();
        
        btn1 = new JButton("Deposit");
        btn2 = new JButton("Withdraw");
        btn3 = new JButton("Exit");
        
        fr.setLayout(new GridLayout(2,1));
        fr.add(p1);
        fr.add(p2);
        p1.setLayout(new GridLayout(2,2));
        p1.add(l1);
        p1.add(tf1);
        p1.add(l2);
        p1.add(tf2);
        p2.setLayout(new FlowLayout());
        p2.add(btn1);
        p2.add(btn2);
        p2.add(btn3);
        fr.pack();
        fr.setVisible(true);
        
    }
}