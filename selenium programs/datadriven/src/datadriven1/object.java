package datadriven1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class object {
	static WebDriver d;
	static HSSFCell cell1;
	static HSSFRow row1;
	static HSSFSheet sh;
	static File f;
	static FileInputStream fs;
	static HSSFWorkbook wb;
	static String Filepath = "C:\\Users\\Sanddep B\\Desktop\\Book.xls";
	static String Sheetname = "Sheet1";

	@BeforeClass
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://a2plcpnl0757.prod.iad2.secureserver.net:2096/logout/?locale=en");
		d.manage().window().maximize();
	}

	@Test(dataProvider = "excelSheet")
	public static void data(String Usr, String Pwd) throws Exception {
		d.findElement(By.id("user")).sendKeys(Usr);
		d.findElement(By.id("pass")).sendKeys(Pwd);
		d.findElement(By.id("login_submit")).click();
		String s3 = d.getTitle();
		/*String s1 = "Webmail - Main";
		object.setcellheading(0, 2, "status");
		for (int i = 1; i <= 4; i++) {
			if (s3.equalsIgnoreCase(s1)) {
				object.setcelldata(i, 2, "pass");
			} else {
				object.setcelldata(i, 2, "fail");
			}*/
		}

	

	@DataProvider
	public static Object[][] excelSheet() throws Exception {
		Object[][] ob = path(Filepath);

		return ob;

	}

	public static String[][] path(String Filename) throws Exception {
		String[][] Data = null;
		File f = new File(Filename);
		fs = new FileInputStream(f);
		wb = new HSSFWorkbook(fs);
		sh = wb.getSheet(Sheetname);
		row1 = sh.getRow(0);
		int rowcount = sh.getLastRowNum() - sh.getFirstRowNum();
		int colcount = sh.getRow(0).getLastCellNum();
		System.out.println(rowcount);
		System.out.println(colcount);

		Data = new String[rowcount + 1][colcount];
		for (int i = 0; i < rowcount + 1; i++) {

			for (int j = 0; j < colcount; j++) {
				HSSFRow row1 = sh.getRow(i);
				HSSFCell cell1 = row1.getCell(j);
				Data[i][j] = cell1.toString();
				System.out.println(Data[i][j]);

			}
		}
		return Data;
	}
	}

	/*public static void setcellheading(int rownum, int colnum, String heading) throws Exception {
		fs = new FileInputStream(f);
		wb = new HSSFWorkbook(fs);
		sh = wb.getSheet(Sheetname);
		row1 = sh.getRow(0);
		cell1 = row1.createCell(2);
		cell1.setCellValue("status");
		FileOutputStream fos = new FileOutputStream(new File(Filepath));
		wb.write(fos);
	}

	public static void setcelldata(int rownum, int colnum, String status) throws Exception {

		row1 = sh.getRow(rownum);
		cell1 = row1.createCell(colnum);
		cell1.setCellValue(status);
		FileOutputStream fos = new FileOutputStream(new File(Filepath));
		wb.write(fos);
	}
}*/