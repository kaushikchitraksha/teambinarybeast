
package votingsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Votepage extends JFrame implements ActionListener {
    JButton b1,b2,b3;
    int a,b;
    Votepage(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("votingsystem/icons/prabhas.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(600, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(50,50,600,600);
        add(l1);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("votingsystem/icons/Salman.jpg"));
        Image i5 = i4.getImage().getScaledInstance(600, 600, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l2 = new JLabel(i6);
        l2.setBounds(800,50,600,600);
        add(l2);
        
        b1 = new JButton("Vote");
        b1.addActionListener(this);
        b1.setBounds(250,680,100,50);
        add(b1);
        
        b2 = new JButton("Vote");
        b2.addActionListener(this);
        b2.setBounds(1000, 675, 100, 50);
        add(b2);
        
        b3 = new JButton("Reasult");
        b3.addActionListener(this);
        b3.setBounds(680,500,100,50);
        add(b3);
        
        setBounds(0,0,1920,1080);
        getContentPane().setBackground(Color.PINK);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String [] args){
        new Votepage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== b1){
            a = a+1;
            JOptionPane.showMessageDialog(null,"you voted for PRABHAS");
            
        }
        if(e.getSource() == b2){
            b = b+1;
            JOptionPane.showMessageDialog(null,"you voted for SALMAN");
        }
        if(e.getSource() == b3){
            JOptionPane.showMessageDialog(null,"PRABHAS = "+a+"SALMAN = "+b);
        }
    }
}
