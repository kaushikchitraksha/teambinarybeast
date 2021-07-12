
package votingsystem;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Votepage2 extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5;
    int a,b,c,d;
    
    
    Votepage2(){
        
        
        
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("votingsystem/icons/bjp.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(217, 232, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0,0,400,400);
        add(l1);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("votingsystem/icons/shiv.png"));
        Image i5 = i4.getImage().getScaledInstance(217, 232, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l2 = new JLabel(i6);
        l2.setBounds(1100,0,400,400);
        add(l2);
        
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("votingsystem/icons/samaj.png"));
        Image i8 = i7.getImage().getScaledInstance(217, 232, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel l4 = new JLabel(i9);
        l4.setBounds(370,0,400,400);
        add(l4);
        
        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("votingsystem/icons/aap.png"));
        Image i11 = i10.getImage().getScaledInstance(217, 232, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel l3 = new JLabel(i12);
        l3.setBounds(750,0,400,400);
        add(l3);
        
               
        b1 = new JButton("Vote");
        b1.addActionListener(this);
        b1.setBounds(150,370,100,50);
        add(b1);
        
        b2 = new JButton("Vote");
        b2.addActionListener(this);
        b2.setBounds(520,370,100,50);
        add(b2);
        
        b3 = new JButton("Vote");
        b3.addActionListener(this);
        b3.setBounds(900,370,100,50);
        add(b3);
        
        b4 = new JButton("Vote");
        b4.addActionListener(this);
        b4.setBounds(1250, 370, 100, 50);
        add(b4);
        
        b5 = new JButton("Reasult");
        b5.addActionListener(this);
        b5.setBounds(680,500,100,50);
        add(b5);
        
        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("votingsystem/icons/back3.png"));
        Image i14 = i13.getImage().getScaledInstance(1563, 1563, Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        JLabel l16 = new JLabel(i15);
        l16.setBounds(0,0,1563,1100);
        add(l16);
        
        setBounds(0,0,1920,1080);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String [] args){
        new Votepage2();
        
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== b1){
            a = a+1;
            JOptionPane.showMessageDialog(null,"you voted for Bharatiya Janata Party");
            
        }
        if(e.getSource() == b2){
            b = b+1;
            JOptionPane.showMessageDialog(null,"you voted for Samajwadi Party");
        }
        if(e.getSource() == b3){
            c = c+1;
            JOptionPane.showMessageDialog(null,"you voted for Aam Aadmi Party");
        }
        if(e.getSource() == b4){
            d = d+1;
            JOptionPane.showMessageDialog(null,"you voted for Shiv Sena");
        }
        
        if(e.getSource() == b5){
            JOptionPane.showMessageDialog(null,"Bharatiya Janata Party = "+a+" Samajwadi Party = "+b+" Aam Aadmi Party = "+c+" Shiv Sena = "+d);
        }
    }
    
}
