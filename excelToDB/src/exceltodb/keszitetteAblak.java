package exceltodb;

import javax.swing.JPanel;
import java.awt.Container;
import javax.swing.JButton;

public class keszitetteAblak extends javax.swing.JFrame {
    
    JButton button_back = new JButton("Vissza");

    keszitetteAblak() {
        setTitle("Készítette");
        setSize(new java.awt.Dimension(500, 500));
        setResizable(rootPaneCheckingEnabled);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
        felepit();
    }
    
    void felepit() {
        Container cp = getContentPane();
        cp.setLayout(new javax.swing.BoxLayout(cp, 3));
        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        cp.add(jPanel1); cp.add(jPanel2);
        jPanel1.add(new javax.swing.JLabel("Készítette: ")); //kell majd rá font formázás, bold, italic
        
        button_back.setSize(new java.awt.Dimension(100,100));
        button_back.addActionListener(new GombFigyelo());
        jPanel1.add(button_back);
               
        /** @todo
            kell még a név, elérhetőség (e-mail, telefonszám, github)
        *   és úgy fog kinézni, hogy: 
        *   (text-align: center)Készítette: <-
        *   Ruszin Dániel
        *   Tel.: +36-20-444-2365
        *   E-mail: daniel.ruszin98@gmail.com
        *   Github: https://github.com/rdPrommie
        * -> 
        * asadasda
        */
        
        pack();
        
    }
    
    class GombFigyelo implements java.awt.event.ActionListener {
        public void actionPerformed(java.awt.event.ActionEvent e) {
            if(e.getSource() == button_back) {
                dispose(); System.out.println("Disposed: keszitetteAblak."); new startAblak().setVisible(true);
            }
        }
    }

}
