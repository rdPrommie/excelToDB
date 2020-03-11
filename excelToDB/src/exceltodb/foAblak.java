package exceltodb;

import java.awt.Container;
import java.awt.TextArea;
import java.io.File;
import java.util.Arrays;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

public class foAblak extends javax.swing.JFrame {
    
    private File kapott_file = null;
    
    private Container cp = getContentPane();
   
    private JPanel jPanel = new JPanel();
    private JPanel jPane2 = new JPanel();
    private JPanel jPane3 = new JPanel();
    private JPanel jPane4 = new JPanel();
    
    private JLabel foAblak_cim = new JLabel("Az adatbázis felépítése");
    
    
     foAblak(File kulso_file){
        setKapottFile(kulso_file);      
        System.out.println(isTablazatFile()); System.exit(0);
        if(isTablazatFile()) {
            felepit();
            ablakBeallitasok();
        }        
    }
     
    private void setKapottFile(File kulso_file) {
        kapott_file = kulso_file;
    }
    
    private boolean isTablazatFile() {        
        return Arrays.asList(common.MEGENGEDETT_KITERJESZTESEK).contains(getExtension(kapott_file.getName()));
    }
    
    private String getExtension(String filename) {
        String extension = "";
        int i = filename.lastIndexOf('.');
        if(i > 0) {
            extension = filename.substring(i+1);
        }
        return extension;
    }
     
    private void felepit(){
        cp.setLayout(new BoxLayout(cp, 3)); cp.add(jPanel);cp.add(jPane2);
        foAblak_cim.setFont(common.font_bold_italic);
        jPanel.add(foAblak_cim);
        cp.add(jPane3);jPane3.add(textArea);        
        cp.add(jPane4);jPane4.add(javax.swing.Box.createHorizontalGlue());jPane4.add(button_vissza);button_vissza.addActionListener(new GombFigyelo());        
        pack();        
    }
    
    private void ablakBeallitasok() {
        setSize(new java.awt.Dimension(1280, 720));
        setResizable(rootPaneCheckingEnabled);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(3);
    }
      
    JButton button_vissza = new JButton("Vissza");
    
    TextArea textArea = new TextArea("Fejlesztés alatt!");
    
    class GombFigyelo implements java.awt.event.ActionListener{
            public void actionPerformed(java.awt.event.ActionEvent e){
                if(e.getSource() == button_vissza) {
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
