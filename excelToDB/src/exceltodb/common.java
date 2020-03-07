package exceltodb;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class common {
    
    public static Font font_bold_italic   = new Font("Times New Roman", Font.BOLD + Font.ITALIC, 20);
    public static Font font_italic        = new Font("Times New Roman", Font.ITALIC, 16);
    public static Font font_common        = new Font("Times New Roman", Font.PLAIN, 14);
    
    public static int randomIntBetween(int a, int b) {
        return (int)Math.floor(Math.random() * ( b-a+1 )+ a);
    }
    
    public static double randomDoubleBetween(double a, double b) {
        return (double) Math.floor(Math.random() * (b-a+1) + a);
    }
    
    public static void showHibaUzenet(String uzenet) {
        JOptionPane.showMessageDialog(null,
                uzenet,
                "Hiba!",
                JOptionPane.ERROR_MESSAGE);
    }
    
    public static void showInfoUzenet(String uzenet) {
        JOptionPane.showMessageDialog(null,
                uzenet);
    }
    
    public static void showWarningUzenet(String uzenet) {
        JOptionPane.showMessageDialog(null,
                uzenet,
                "Figyelem!",
                JOptionPane.WARNING_MESSAGE);
    }

}
