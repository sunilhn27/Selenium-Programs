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

public class title {
	File f;
	HSSFWorkbook wb;
	HSSFRow row;
	HSSFCell cell;
	HSSFSheet sh;
	FileInputStream fs;
	FileOutputStream fos;
	WebDriver d;
	static String s;

	@Test(priority = 0)
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		d = new ChromeDriver();
		d.get(" https://www.javatpoint.com/java-tutorial");
		d.manage().window().maximize();

	}

	@Test(priority = 1)
	public void gettitle() {
		String s = d.getTitle();
		System.out.println(s);

	}

	@Test(priority = 3)
	public void writeexcel1() throws Exception {
		f = new File("C:\\Users\\Sanddep B\\Desktop\\links.xls");
		fs = new FileInputStream(f);
		wb = new HSSFWorkbook(fs);
		sh = wb.getSheet("Sheet1");
		int rowcount = sh.getLastRowNum();
		int colcount = sh.getRow(0).getLastCellNum();
		for (int i = 1; i <= 10; i++) {

			for (int j = 0; j <= colcount; j++) {
				row = sh.getRow(i);
				cell = row.getCell(j);
				cell = row.createCell(j);
				cell.setCellValue("pass");

			}
		}
		fos = new FileOutputStream(f);
		wb.write(fos);

	}

}
