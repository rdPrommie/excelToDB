package exceltodb;

import java.sql.*;
import static java.sql.DriverManager.getConnection;
import java.util.Vector;

public class database {
    
    private static Connection kapcsolat;
    private static Statement parancs;
    
    public database() {}
    
    public static void kapcsolodik() {
        try {
            kapcsolat = getConnection("jdbc:sqlite:asdf");   
            parancs = kapcsolat.createStatement();
        } catch (Exception e) {
            System.err.println(e);
        }
        System.out.println("Az SQLite készen áll.");
    }
    
    public static void kapcsolatBont() {
        try {
            kapcsolat.close(); System.out.println("Kapcsolat bontva");            
        } catch(Exception e) {
            System.err.println(e);
        }
    }
    
    public static void execute(String s) {
        try {
            parancs.execute(s);
        } catch(Exception e) {
            System.err.println(e);
        }
    }
    
}
