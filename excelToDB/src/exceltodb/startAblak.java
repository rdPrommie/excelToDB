package exceltodb;

import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class startAblak extends javax.swing.JFrame {

    public startAblak() {          
        setTitle("Excel to Database Generator"); //kell majd egy excel ikon -> db ikon kép (Photoshop)
        setSize(new java.awt.Dimension(500,500));
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        felepit();
    }
    
    void felepit() {
        java.awt.Container cp = getContentPane();
        cp.setLayout(new javax.swing.BoxLayout(cp, 3));
        JPanel jPanel   = new JPanel();cp.add(jPanel);
        JLabel jLabel1  = new JLabel("Adatbázis Excel táblázatból generátor");jPanel.add(jLabel1); Font font = new Font("Times New Roman", Font.BOLD + Font.ITALIC,20); jLabel1.setFont(font);
        JPanel jPane2   = new JPanel(); cp.add(jPane2); 
        JPanel jPane3   = new JPanel();cp.add(jPane3);
        jPane3.add(button);button.setSize(new java.awt.Dimension(100,100)); button.addActionListener(new startAblak.GombFigyelo());
        jPane3.add(button2);button2.setSize(new java.awt.Dimension(100,100)); button2.addActionListener(new startAblak.GombFigyelo());
        jPane3.add(button3);button3.setSize(new java.awt.Dimension(100,100)); button3.addActionListener(new startAblak.GombFigyelo());
        
        pack();
    }
    
    JButton button  = new JButton("Táblázat beolvasás");
    JButton button2 = new JButton("Készítette");
    JButton button3 = new JButton("Kilépés");
    
    
    class GombFigyelo implements java.awt.event.ActionListener{
        public void actionPerformed(java.awt.event.ActionEvent e){
            if(e.getSource() == button3) System.exit(0);
            else if(e.getSource() == button2) {
                dispose(); System.out.println("Disposed: startAblak.");
                System.out.println("setVisible: keszitetteAblak."); new keszitetteAblak().setVisible(true);
            }                
            else if(e.getSource() == button) {
                dispose(); System.out.println("Disposed: startAblak.");
                System.out.println("setVisible: foAblak.");new foAblak().setVisible(true);
            }
        }
    }
    
}

