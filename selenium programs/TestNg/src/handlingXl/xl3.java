package handlingXl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;

public class xl3 {

	public static void data() throws Exception {

		File f = new File("C:\\Users\\Sunil\\Desktop\\sunil.xlsx");
		FileInputStream fs = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fs);
		XSSFSheet sh = wb.getSheet("Sheet1");
		XSSFRow row = sh.getRow(0);
		int rowcount = sh.getLastRowNum() - sh.getFirstRowNum();
		int colcount = sh.getRow(0).getLastCellNum();
		for (int i = 1; i <= rowcount; i++) {

			for (int j = 0; j < colcount; j++) {
				XSSFRow row1 = sh.getRow(i);
				XSSFCell cell1 = row1.getCell(j);

				String s = cell1.toString();
				System.out.println(s);
				if (j == 0) {
					webmailxl.user = webmailxl.d.findElement(By.id("user"));

					webmailxl.user.sendKeys(s);

				}
				if (j == 1) {
					webmailxl.pass = webmailxl.d.findElement(By.id("pass"));
					webmailxl.pass.sendKeys(s);
					webmailxl.login_submit = webmailxl.d.findElement(By.id("login_submit"));
					webmailxl.login_submit.click();
					String s3 = webmailxl.d.getTitle();
					String s1 = "Webmail - Main";
					if (s3.equalsIgnoreCase(s1)) {
						webmailxl.lnkHeaderLogout = webmailxl.d.findElement(By.id("lnkHeaderLogout"));
						webmailxl.lnkHeaderLogout.click();
						// webmailxl.user.clear();

					}

					else {
						webmailxl.user.clear();
					}
				}
			}
		}
	}
}
