package exceltodb;

import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class startAblak extends javax.swing.JFrame {
    
    private BufferedImage image;
    private JButton button_tablazat_beolvasas   = new JButton("Táblázat beolvasás");
    private JButton button_keszitette           = new JButton("Készítette");
    private JButton button_kilepes              = new JButton("Kilépés");
    private JPanel panel_cim                    = new JPanel();
    private JPanel panel_kep                    = new JPanel(); 
    private JPanel panel_gombok                 = new JPanel(); 
    private JLabel label_cim                    = new JLabel("Adatbázis Excel táblázatból generátor");

    public startAblak() {          
        felepit();
        setTitle("Excel to Database Generator");
        setResizable(false);
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        setSize(new java.awt.Dimension(500,400));
    }
    
    void felepit() {
        java.awt.Container cp = getContentPane();
        cp.setLayout(new javax.swing.BoxLayout(cp, 3));
        cp.add(panel_cim);cp.add(panel_kep);cp.add(panel_gombok);
        panel_cim.add(label_cim); label_cim.setFont(common.font_bold_italic);
        
        try {
            BufferedImage myPicture = ImageIO.read(new File("C:/Users/danie/Documents/Project/excelToDB/img/xlxstodb.jpg"));
            //@todo - képméretezés
            JLabel picLabel = new JLabel(new ImageIcon(myPicture));
            add(picLabel);
        } catch(IOException ioe) {
            System.err.println(ioe);
            common.showHibaUzenet("Nem található a fájl!");
        }
        
        
        panel_gombok.add(button_tablazat_beolvasas); button_tablazat_beolvasas.addActionListener(new startAblak.GombFigyelo());
        panel_gombok.add(button_keszitette); button_keszitette.addActionListener(new startAblak.GombFigyelo());
        panel_gombok.add(button_kilepes); button_kilepes.addActionListener(new startAblak.GombFigyelo());
        
        pack();
       
    }
    
    /*
    
    */
    
    
    
    
    class GombFigyelo implements java.awt.event.ActionListener{
        public void actionPerformed(java.awt.event.ActionEvent e){
            if(e.getSource() == button_kilepes) System.exit(0);
            else if(e.getSource() == button_keszitette) {
                dispose(); System.out.println("Disposed: startAblak.");
                System.out.println("setVisible: keszitetteAblak."); new keszitetteAblak().setVisible(true);
            }                
            else if(e.getSource() == button_tablazat_beolvasas) {
                dispose(); System.out.println("Disposed: startAblak.");
                System.out.println("setVisible: foAblak.");new foAblak().setVisible(true);
            }
        }
    }
    
}

