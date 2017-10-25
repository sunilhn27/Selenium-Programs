package handlingXl;

import java.io.FileInputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class handlingxl4 {
	static WebDriver d;
}

public static void main(String[] args) {
	
	
	Sheet s;

	FileInputStream fi = new FileInputStream("D:\\Selenium Webd\\VineetFolderNew\\vineettest.xls");
	XSSFWorkbook wb = new XSSFWorkbook();
	XSSFSheet sh = wb.getSheet("Sheet1");
	System.out.println("no of rows:"+sh);
	d.get("http://www.gmail.com");
	sh = wb.getSheet("Sheet1");
	int z=wb.getRows();
	for(int row=0; row <=s.getRows();row++)
	{
	String username = s.getCell(0, row).getContents();
	System.out.println("Username "+username);
	
	
	d.findElement(By.name("Email")).sendKeys(username);
	String password= s.getCell(1, row).getContents();
	System.out.println("Password "+password);
	d.findElement(By.name("Passwd")).sendKeys(password);
	Thread.sleep(10000);
}

}
