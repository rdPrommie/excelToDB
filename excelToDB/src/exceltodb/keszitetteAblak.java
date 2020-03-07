package exceltodb;

import javax.swing.JPanel;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JLabel;

public class keszitetteAblak extends javax.swing.JFrame {
    
    private JButton button_back                 = new JButton("Vissza");
    private JPanel panel_cim_sor                = new JPanel();
    private JPanel panel_nev_sor                = new JPanel();
    private JPanel panel_tovabbi_adatok_sor     = new JPanel();
    private JPanel panel_vissza_gomb_sor        = new JPanel();
    private JLabel label_keszitette             = new JLabel("Készítette");
    private JLabel label_nev                    = new JLabel("Ruszin Dániel");
    private JLabel label_tovabbi_adatok         = new JLabel("");
    private final String tel                    = "Tel.: +36-20/444-2365";
    private final String email                  = "E-mail: daniel.ruszin98@gmail.com";
    private final String github                 = "Github: https://github.com/rdPrommie";
  
    

    keszitetteAblak() {
        felepit();
        setTitle("Készítette");
        setSize(new java.awt.Dimension(500, 400));
        setResizable(rootPaneCheckingEnabled);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
    }
    
    void felepit() {
        Container cp = getContentPane();
        cp.setLayout(new javax.swing.BoxLayout(cp, 3));
        cp.add(panel_cim_sor); cp.add(panel_nev_sor); cp.add(panel_tovabbi_adatok_sor); cp.add(panel_vissza_gomb_sor);
        panel_cim_sor.add(label_keszitette); label_keszitette.setFont(common.font_bold_italic);
        panel_nev_sor.add(label_nev); label_nev.setFont(common.font_italic);
        label_tovabbi_adatok.setText("<html>" + tel + "<br>" + email + "<br>" + github);
        panel_tovabbi_adatok_sor.add(label_tovabbi_adatok); label_tovabbi_adatok.setFont(common.font_common);
        
        
        button_back.setSize(new java.awt.Dimension(100,100));
        button_back.addActionListener(new GombFigyelo());
        panel_vissza_gomb_sor.add(button_back);
        
        pack();
        
    }
    
    class GombFigyelo implements java.awt.event.ActionListener {
        public void actionPerformed(java.awt.event.ActionEvent e) {
            if(e.getSource() == button_back) {
                dispose(); System.out.println("Disposed: keszitetteAblak."); 
                new startAblak().setVisible(true);
            }
        }
    }

}
