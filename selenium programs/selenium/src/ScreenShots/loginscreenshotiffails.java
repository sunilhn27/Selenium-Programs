package ScreenShots;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginscreenshotiffails {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		d.get("https://a2plcpnl0757.prod.iad2.secureserver.net:2096/logout/?locale=en");
		d.manage().window().maximize();
		String s1="Webmail Login";
		WebElement wb=d.findElement(By.id("user"));
		wb.sendKeys("sunilhn@htmltech.in");
		WebElement wb1=d.findElement(By.id("pass"));
		wb1.sendKeys("sunil@065");
		d.findElement(By.id("login_submit")).click();
		
		if(s1.equalsIgnoreCase(d.getTitle())){
			System.out.println("login failed");
			TakesScreenshot s = (TakesScreenshot) d;
			File f = s.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File("C:\\Users\\Sanddep B\\Desktop\\screenshots\\" + "login failed"+ d.getTitle() + ".png"));
		}
		else{
			System.out.println("logged in");
			
		}
		d.close();
		
	}

}
