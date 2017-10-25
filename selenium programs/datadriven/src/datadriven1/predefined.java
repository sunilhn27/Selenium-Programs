package datadriven1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class predefined {
	WebDriver d;
	File f;
	HSSFWorkbook wb;
	HSSFRow row;
	HSSFCell cell;
	HSSFSheet sh;
	FileInputStream fs;
	FileOutputStream fos;

	@Test
	public void method() throws Exception{

		f = new File("C:\\Users\\Sanddep B\\Desktop\\print.xls");
		fs = new FileInputStream(f);
		wb = new HSSFWorkbook(fs);
		sh = wb.getSheet("Sheet1");
	int rowcount = sh.getLastRowNum() - sh.getFirstRowNum();
	System.out.println(rowcount);
	//	int colcount = sh.getRow(0).getLastCellNum();
	
		for(int i=1;i<=rowcount;i++){
			row = sh.getRow(i);
			cell=row.createCell(1);
			cell.setCellValue("pass");
			fos=new FileOutputStream(f);
			wb.write(fos);
			
		
	}
		
}
}
