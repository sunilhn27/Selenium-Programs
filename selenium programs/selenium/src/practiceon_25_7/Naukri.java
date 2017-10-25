package practiceon_25_7;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Naukri {
	public static void main(String[] args) throws IOException {
	/*	System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();*/
		WebDriver d=new FirefoxDriver();
		d.get("https://my.naukri.com/account/createaccount");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		d.findElement(By.
				xpath("html/body/div[1]/form/div[1]/div/button")).click();
		d.findElement(By.
				xpath(".//*[@id='basicDetailForm']/resman-uploader/div/div[1]/span[1]/input")).click();
		Runtime.getRuntime().exec("C:\\Users\\Sanddep B\\Desktop\\uploads\\Naukri1.exe");
		}
}