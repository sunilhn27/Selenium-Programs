package jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dislinks {
	File f;
	FileInputStream fs;
	FileOutputStream fos;
	HSSFWorkbook wb;
	HSSFSheet sh;
	HSSFRow row;
	HSSFCell cell;
	WebDriver d;

	int size;

	@Test
	public void launch() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		d = new ChromeDriver();
		d.get(" https://www.google.co.in/");
		d.manage().window().maximize();
		List<WebElement> wb1 = d.findElements(By.tagName("a"));
		size = wb1.size();
		f = new File("C:\\Users\\Sanddep B\\Desktop\\Book1.xls");
		fs = new FileInputStream(f);
		wb = new HSSFWorkbook(fs);
		int rowcount = 1;
		sh = wb.getSheet("Sheet1");
		for (WebElement li : wb1) {
			if (li.isDisplayed()) {
				row = sh.createRow(rowcount++);
				cell = row.createCell(0);
				cell.setCellValue(li.getText());

				System.out.println(li.getText());
			}
		}
		fos = new FileOutputStream(f);
		wb.write(fos);

	}
}