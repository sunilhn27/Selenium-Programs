package datadriven1;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class A {
	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		File f = new File("D:\\suniljar\\selenium programs\\datadriven\\src\\datadriven1\\f.properties");
	    FileInputStream is = new FileInputStream(f);
	    p.load(is);
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get(p.getProperty("url"));
		d.findElement(By.id(p.getProperty("username"))).sendKeys("sunikl");

		d.findElement(By.id(p.getProperty("password"))).sendKeys("sunil");
		d.findElement(By.id(p.getProperty("login"))).click();

	}
}
