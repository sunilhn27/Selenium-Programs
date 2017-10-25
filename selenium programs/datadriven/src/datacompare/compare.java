package datacompare;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.annotations.Test;

@Test
public class compare {

	static HSSFWorkbook wb;
	static HSSFSheet sh;
	static HSSFRow row;
	static HSSFCell cell;
	static FileInputStream fs;
	static FileOutputStream fos;
	static String s;

	public static void com() throws Exception {
		File f = new File("C:\\Users\\Sanddep B\\Desktop\\datacompare.xls");
		fs = new FileInputStream(f);
		wb = new HSSFWorkbook(fs);
		sh = wb.getSheet("Sheet1");
	//	row = sh.getRow(0);
		int rowcount = sh.getLastRowNum();
		int colcount = sh.getRow(0).getLastCellNum();
		System.out.println(rowcount + "  " + colcount);
		for (int i = 1; i <=rowcount; i++) {
			for (int j = 0; j < colcount; j++) {
				if(j==0){
				row = sh.getRow(i);
				cell = row.getCell(j);
				 s = cell.getStringCellValue();
				System.out.println(s);}
				if(j==2){
					cell = row.createCell(j);
					cell.setCellValue("printed url on console");
				}
				if (j == 3) {
					cell = row.createCell(j);
					cell.setCellValue("pass");
					

				}
			}
		}
		fos = new FileOutputStream(f);
		wb.write(fos);
		System.out.println("fio");

	}
}
