package datadriven1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.Test;

public class data {

	@Test
	public static void run() throws Exception {
		File f = new File("C:\\Users\\Sanddep B\\Desktop\\sun.xls");
		FileInputStream fs = new FileInputStream(f);
		HSSFWorkbook wb = new HSSFWorkbook(fs);
		HSSFSheet sh = wb.getSheet("Sheet1");
	//	HSSFRow row = sh.getRow(0);
		int rowcount = sh.getLastRowNum() - sh.getFirstRowNum();
		int colcount = sh.getRow(0).getLastCellNum();
		dataelements.user.clear();
		for (int i = 1; i <rowcount; i++) {
		for (int j = 0; j < colcount; j++) {
				HSSFRow row1=sh.getRow(i);
				HSSFCell cell=row1.getCell(j);
				String s=cell.toString();
				
				System.out.println(s);
			}
}
}}