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


public class links {
	static File f;
	static HSSFWorkbook wb;
	static HSSFRow row;
	static HSSFCell cell;
	static HSSFSheet sh;
	static FileInputStream fs;
	static FileOutputStream fos;
	static WebDriver d;
	static String s;
	static int size;
	static List<WebElement> wb1;

	@Test(priority = 0)
	public void launch() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		d = new ChromeDriver();
		d.get(" https://www.javatpoint.com/java-tutorial");
		d.manage().window().maximize();
		wb1 = d.findElements(By.tagName("a"));
		size = wb1.size();
		writetoexcel(wb1, "C:\\Users\\Sanddep B\\Desktop\\Book1.xls");

	}

	public static void writetoexcel(List<WebElement> links, String filepath) throws Exception {

		f = new File(filepath);
		fs = new FileInputStream(f);
		wb = new HSSFWorkbook(fs);
		int rowcount = 1;
		sh = wb.getSheet("Sheet1");

		for (WebElement li : wb1) {
			row = sh.createRow(rowcount++);
			writetorow(li);
		}

	}

	public static void writetorow(WebElement li) throws Exception {

		cell = row.createCell(0);
		cell.setCellValue(li.getText());

		fos = new FileOutputStream(f);
		wb.write(fos);

	
}

}