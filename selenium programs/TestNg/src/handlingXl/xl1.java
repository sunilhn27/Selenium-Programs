package handlingXl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class xl1 {
	static HSSFWorkbook wb ;
	static 	HSSFSheet sh;
	static  HSSFRow row ;
	static  HSSFCell cell;
	static FileInputStream fs;
	static FileOutputStream fos;
	static File f ;
	public static  void main(String[] args) throws Exception {
		File f = new File("C:\\Users\\Sanddep B\\Desktop\\da.xls");
	fs = new FileInputStream(f);
 wb = new HSSFWorkbook(fs);
		 sh = wb.getSheet("Sheet1");
		 row = sh.getRow(0);
		 cell = row.getCell(1);
		String data=cell.toString();
		System.out.println(data);
		
		fos=new FileOutputStream(f);
		
		 row = sh.getRow(0);
		 cell = row.createCell(2);
		 cell.setCellValue("pass");
		 wb.write(fos);
		 
		
		
	
}
}
