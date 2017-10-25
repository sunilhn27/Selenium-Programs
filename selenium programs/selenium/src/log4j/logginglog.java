package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class logginglog {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		Logger l=Logger.getLogger("log1");
		PropertyConfigurator.configure("log4j.Properties");
		ChromeDriver d=new ChromeDriver();
		l.info("Launching the browser");
		d.get("https://a2plcpnl0757.prod.iad2.secureserver.net:2096/");
		l.info("going to specific URl");
		WebElement wb=d.findElement(By.id("user"));
		wb.sendKeys("sunilhn@htmltech.in");
		WebElement wb1=d.findElement(By.id("pass"));
        wb1.sendKeys("sunil@065");
        d.findElement(By.id("login_submit")).click();
        l.info("logged in ");
        d.findElement(By.id("lblLogout"));
        l.info("logged out");
        
	}

}
