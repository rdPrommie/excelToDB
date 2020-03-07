package exceltodb;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import static javax.swing.SwingUtilities.updateComponentTreeUI;
import javax.swing.UIManager;


public class ExcelToDB {
    JFrame frame_startAblak = new exceltodb.startAblak();
    public ExcelToDB() {        
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        SwingUtilities.updateComponentTreeUI(frame_startAblak);updateComponentTreeUI(frame_startAblak);
        frame_startAblak.setVisible(true);
    }

    public static void main(String[] args) {
        new ExcelToDB();
    }
    
}
