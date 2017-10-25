package datadriven1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class compareurl {
	WebDriver d;
	File f;
	HSSFWorkbook wb;
	HSSFRow row;
	HSSFCell cell;
	HSSFSheet sh;
	FileInputStream fs;
	FileOutputStream fos;

	@Test
	public void compareing() throws Exception {
		f = new File("C:\\Users\\Sanddep B\\Desktop\\compare.xls");
		fs = new FileInputStream(f);
		wb = new HSSFWorkbook(fs);
		sh = wb.getSheet("Sheet1");
		int rowcount = sh.getLastRowNum();
		int colcount = sh.getRow(0).getLastCellNum();
		System.out.println(rowcount + "   " + colcount);
		for (int i = 1; i <= rowcount; i++) {

			for (int j = 0; j < colcount; j++) {
				row = sh.getRow(i);
				cell = row.getCell(j);
				String s = cell.toString();
				System.out.println(s);

				if (j == 0) {
					System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
					d = new ChromeDriver();
					d.manage().window().maximize();
					d.get(s);
					String title = d.getTitle();
				}

				if (j == 1) {
					String exptitle = "Webmail Login";
					if (exptitle.equalsIgnoreCase(d.getTitle())) {
						cell = row.createCell(2);
						cell.setCellValue(d.getTitle());
						cell = row.createCell(3);
						cell.setCellValue("pass");
						cell = row.createCell(4);
						cell.setCellValue("passing");
						

					} else {
						cell = row.createCell(2);
						cell.setCellValue(d.getTitle());
						
						cell = row.createCell(3);
						cell.setCellValue("Fail");

					}

					fos = new FileOutputStream(f);
					wb.write(fos);
					
				}

			}
		}

	}
}
