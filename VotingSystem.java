
package votingsystem;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.WindowEvent;



public class VotingSystem extends JFrame implements ActionListener {
    JButton b1;
    
    VotingSystem(){
        setBounds(0,0,1920,1080);
        getContentPane().setBackground(Color.BLUE);
        
        JLabel l1 = new JLabel("Welcome To Online Voting System");
        l1.setFont(new Font("Tw Cen MT Condensed Extra Bold",Font.BOLD,75));
        l1.setBounds(200,50,1200,100);
        add(l1);
        
               
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("votingsystem/icons/logo3.JPG"));
        Image i2 = i1.getImage().getScaledInstance(251, 241, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(1200,200,251,241);
        add(l3);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("votingsystem/icons/back.png"));
        Image i5 = i4.getImage().getScaledInstance(1563, 1563, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l6 = new JLabel(i6);
        l6.setBounds(0,0,1563,1200);
        add(l6);
        

        
        b1 = new JButton("NEXT");
        b1.setBounds(735,600,80,50);
        b1.addActionListener(this);
        b1.setFont(new Font("Tahoma",Font.BOLD,15));
        add(b1);
        
        
        setLayout(null);
        setVisible(true);
    }
    

   
    public static void main(String[] args) {
        new VotingSystem();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new loginpage().setVisible(true);
        
        
    }
    
}
