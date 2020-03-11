package exceltodb;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
//import org.apache.poi.hssf.usermodel.HSSFSheet;  
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;  
//import org.apache.poi.ss.usermodel.Cell;  
//import org.apache.poi.ss.usermodel.FormulaEvaluator;  
//import org.apache.poi.ss.usermodel.Row;  

public class excelFileReader {
    
    public excelFileReader(File tablazat) throws IOException{
        
        FileInputStream fis = new FileInputStream(tablazat);
        
//        HSSFWorkbook wb = new HSSFWorkbook(fis);

        //@todo - megírni az olvasót
        
    }
    
}
