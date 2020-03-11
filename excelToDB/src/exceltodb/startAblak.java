package exceltodb;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import static java.nio.channels.AsynchronousServerSocketChannel.open;
import static java.nio.channels.AsynchronousServerSocketChannel.open;
import java.util.Scanner;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
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
            image = ImageIO.read(new File("../img/xlxstodb.jpg"));
            image = common.resize(image, 250, 250);
            JLabel picLabel = new JLabel(new ImageIcon(image));
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
    
    class GombFigyelo implements java.awt.event.ActionListener{
        public void actionPerformed(java.awt.event.ActionEvent e){
            if(e.getSource() == button_kilepes) System.exit(0);
            else if(e.getSource() == button_keszitette) {
                dispose(); System.out.println("Disposed: startAblak.");
                System.out.println("setVisible: keszitetteAblak."); new keszitetteAblak().setVisible(true);
            }                
            else if (e.getSource() == button_tablazat_beolvasas) {
                File valasztott_file = fileKivalasztas();
                dispose();
                System.out.println("Disposed: startAblak.");
                System.out.println("setVisible: foAblak.");new foAblak(valasztott_file).setVisible(true);
            }
        }
    }
    
    private File fileKivalasztas() {
        JFileChooser valasztott_file = new JFileChooser();
        int option = valasztott_file.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            try {
                return valasztott_file.getSelectedFile();
            } catch (Exception e) {
                System.err.println(e);
                common.showHibaUzenet("Hibás vagy nem elérhető fájl!");
            }
        }
        return null;
    }
}

