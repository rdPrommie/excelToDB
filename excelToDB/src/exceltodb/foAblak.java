package exceltodb;

import java.awt.TextArea;
import java.io.File;
import javax.swing.JPanel;
import javax.swing.JButton;

public class foAblak extends javax.swing.JFrame {
    
    private File kapott_file = null;
    
     foAblak(File kulso_file){
        setKapottFile(kulso_file);
        isTablazatFile();
        felepit();
        setSize(new java.awt.Dimension(1280,720));
        setResizable(rootPaneCheckingEnabled);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
    }
     
    private void setKapottFile(File kulso_file) {
        kapott_file = kulso_file;
    }
    
    private void isTablazatFile() {
        //xls, xlsx, csv, ods
//        String ext2 = FilenameUtils.getExtension("bar.exe");
    }
     
    private void felepit(){
        java.awt.Container cp = getContentPane();
        cp.setLayout(new javax.swing.BoxLayout(cp, 3));
        JPanel jPanel = new JPanel();
        JPanel jPane2 = new JPanel();
        JPanel jPane3 = new JPanel();
        JPanel jPane4 = new JPanel();
        cp.add(jPanel);cp.add(jPane2);
        jPanel.add(new javax.swing.JLabel("Feladat megjelenítés"));
        
        
        jPane2.add(button3);button3.setSize(new java.awt.Dimension(100,100));button3.addActionListener(new GombFigyelo());
        jPane2.add(button4);button4.setSize(new java.awt.Dimension(100,100));button4.addActionListener(new GombFigyelo());
        jPane2.add(button5);button5.setSize(new java.awt.Dimension(100,100));button5.addActionListener(new GombFigyelo());
        jPane2.add(button6);button6.setSize(new java.awt.Dimension(100,100));button6.addActionListener(new GombFigyelo());
        jPane2.add(button7);button6.setSize(new java.awt.Dimension(100,100));button7.addActionListener(new GombFigyelo());
        jPane2.add(button8);button6.setSize(new java.awt.Dimension(100,100));button8.addActionListener(new GombFigyelo());
        jPane2.add(button9);button6.setSize(new java.awt.Dimension(100,100));button9.addActionListener(new GombFigyelo());
        jPane2.add(button10);button6.setSize(new java.awt.Dimension(100,100));button10.addActionListener(new GombFigyelo());
        
        cp.add(jPane3);jPane3.add(textArea);
        
        cp.add(jPane4);jPane4.add(javax.swing.Box.createHorizontalGlue());jPane4.add(button_back);button_back.addActionListener(new GombFigyelo());
        
        pack();
        
    }
      
      
    JButton button3 = new JButton("Ötös");
    JButton button4 = new JButton("Hatos");
    JButton button5 = new JButton("Hetes");
    JButton button6 = new JButton("Nyolcas");
    JButton button7 = new JButton("Kilences");
    JButton button8 = new JButton("Tizes");
    JButton button9 = new JButton("Tizenegyes");
    JButton button10 = new JButton("Tizenkettes");
    JButton button_back = new JButton("Vissza");
    
    TextArea textArea = new TextArea("Nyomjon egy gombra a megjelenítéshez!");
    
    class GombFigyelo implements java.awt.event.ActionListener{
            public void actionPerformed(java.awt.event.ActionEvent e){
                if(e.getSource() == button_back) {
                    dispose();System.out.println("Disposed: foAblak"); new startAblak().setVisible(true);
                }
            }
        }
    
    class EgerFigyelo extends java.awt.event.MouseAdapter{
        public void mouseEntered(java.awt.event.MouseEvent e){
            //nem tudom, hogy ez miért van itt ez még mindig, viszont lehet használni fogom
        }
    }
    
}
