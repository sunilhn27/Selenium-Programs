package excell;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class excell1 {

	public static void data1() throws Exception {

		String beforelogin = "Webmail Login ";
		String afterlogin = "Webmail - Main";
		File f = new File("C:\\Users\\Sanddep B\\Desktop\\bok.xlsx");
		FileInputStream fs = new FileInputStream(f);
		FileOutputStream fos = new FileOutputStream(f);
		HSSFWorkbook wb = new HSSFWorkbook(fs);
		HSSFSheet sh = wb.getSheet("Sheet1");
		HSSFRow row = sh.getRow(0);
		int rowcount = sh.getLastRowNum() - sh.getFirstRowNum();
		int colcount = sh.getRow(0).getLastCellNum();
		System.out.println(rowcount + "" + colcount);
		excellwebelement.user.clear();
		for (int i = 1; i <rowcount; i++) {
			for (int j = 0; j < colcount; j++) {
				HSSFRow row1 = sh.getRow(i);
				HSSFCell cell1 = row1.getCell(j);

				String s = cell1.toString();
				System.out.println(s);

				if (j == 0) {

					excellwebelement.user.sendKeys(s);
				}

				if (j == 1) {

					excellwebelement.pass.sendKeys(s);
					excellwebelement.login_submit.click();

					String s3 = excellwebelement.d.getTitle();
					String s1 = "Webmail - Main";
					if (s3.equalsIgnoreCase(s1)) {
						excellwebelement.lnkHeaderLogout.click();
						
						cell1 = row1.createCell(2);
						cell1.setCellValue("pass");
						
					}
					else 
					{
						
						row = sh.getRow(i);
						cell1 = row1.createCell(2);
						cell1.setCellValue("Fail");
						
					}
					
				if (beforelogin.equalsIgnoreCase(excellwebelement.d.getTitle())) {
					//	FileOutputStream f1 = new FileOutputStream(f);
						row = sh.getRow(i);
						cell1 = row1.createCell(3);
						cell1.setCellValue(excellwebelement.d.getTitle());
						
					}else
					{
						
						row = sh.getRow(i);
						cell1 = row1.createCell(4);
						cell1.setCellValue(excellwebelement.d.getTitle());
						
					}
				wb.write(fos);

					excellwebelement.user.clear();
				}
			}
		}

	}}

