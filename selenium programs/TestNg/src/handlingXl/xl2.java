package handlingXl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class xl2 {

	public static void main(String[] args) throws Exception {
		File f = new File("D:\\suniljar\\data.xlsx");
		FileInputStream fs = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sh = wb.getSheet("Sheet1");
		int rowcount = sh.getLastRowNum() - sh.getFirstRowNum();
		int colcount = sh.getRow(0).getLastCellNum();
		for (int i = 0; i < rowcount; i++) {

			for (int j = 0; j < colcount; j++) {
				XSSFRow row = sh.getRow(i);
				XSSFCell cell = row.getCell(j);
				String s = cell.toString();
				System.out.print(s);
				
			}

		}
	

	}

}
