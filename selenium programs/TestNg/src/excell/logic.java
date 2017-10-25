package excell;

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

public class logic {

	public static void run() throws Exception {
		File f = new File("C:\\Users\\Sanddep B\\Desktop\\data1.xlsx");
		FileInputStream fs = new FileInputStream(f);
		FileOutputStream fos=new FileOutputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFCell cell ;
		XSSFRow row1;
		XSSFSheet sh = wb.getSheet("Sheet1");
		XSSFRow row = sh.getRow(0);
		int rowcount = sh.getLastRowNum() - sh.getFirstRowNum();
		int colcount = sh.getRow(0).getLastCellNum();
		for (int i = 0; i <= rowcount; i++) {
			for (int j = 0; j < colcount; j++) {
				 row1 = sh.getRow(i);
				 cell = row1.getCell(j);
				String s = cell.toString();
				System.out.println(s);
				
				  if(j==0)
				  { 

					  mainmethod.user.sendKeys(s);
				  }
				  
				  if(j==1){
					  
					  mainmethod.pass.sendKeys(s);
					  mainmethod.login_submit.click();
					  String s3 = excellwebelement.d.getTitle();
						String s1 = "Webmail - Main";
						if (s3.equalsIgnoreCase(s1)) {
							excellwebelement.lnkHeaderLogout.click();
							
						cell = row1.createCell(2);
							cell.setCellValue("pass");
							
						}
						else 
						{
							
							row = sh.getRow(i);
							cell = row1.createCell(2);
							cell.setCellValue("Fail");
							
						}
				  }
				 wb.write(fos);
				  mainmethod.user.clear();
				 

			}
			

		}

	}

}
