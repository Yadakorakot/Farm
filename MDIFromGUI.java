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
public class MDIFromGUI {
    private JDesktopPane dp;
    private JInternalFrame fr1, fr2, fr3;
    private JFrame fr;
    private JMenuBar mb;
    private JMenu m1,m2,m3,ms1;
    private JMenuItem mi1, mi2, mi3, mi4, msi1, msi2;
    
    public MDIFromGUI() {
        fr = new JFrame("SubMenuItem Demo");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mb = new JMenuBar();
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        fr.setJMenuBar(mb);
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        ms1 = new JMenu("New");
        mi2 = new JMenuItem("Open");
        mi3 = new JMenuItem("Save");
        mi4 = new JMenuItem("Exit");

        m1.add(ms1);
        m1.add(mi2);
        m1.addSeparator();
        m1.add(mi3);
        m1.addSeparator();
        m1.add(mi4);
        msi1 = new JMenuItem("Window");
        msi2 = new JMenuItem("Message");
        ms1.add(msi1);
        ms1.addSeparator();
        ms1.add(msi2);
        dp = new JDesktopPane();
        fr1 = new JInternalFrame("Application 01");
        fr2 = new JInternalFrame("Application 02");
        fr3 = new JInternalFrame("Application 03");
        fr.setSize(500, 500);
        fr.add(dp);
        dp.add(fr1);
        dp.add(fr2);
        dp.add(fr3);
        fr.setVisible(true);
        
        fr1.setSize(100,100);
        fr1.add(new JLabel());
        fr1.setVisible(true);
        fr2.setSize(200,200);
        fr2.add(new JLabel());
        fr2.setVisible(true);
        fr3.setSize(200,300);
        fr3.add(new JLabel());
        fr3.setVisible(true);

    }
}
    