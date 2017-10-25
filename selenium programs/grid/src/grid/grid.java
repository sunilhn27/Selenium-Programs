package grid;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class grid {
static URL url;


@Test
public void launch() throws Exception{
	DesiredCapabilities cap=DesiredCapabilities.chrome();
	URL url=new URL("http://localhost:4444/wd/hub");
	WebDriver d=new RemoteWebDriver(url,cap);
	d.get("http://www.google.co.in");
	d.manage().window().maximize();
	Actions a=new Actions(d);
	d.findElement(By.id("lst-ib")).sendKeys("selenium");
	//a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER);
	
	
	a.build().perform();
	//a.sendKeys(Keys.ENTER);
	Thread.sleep(2000);
//	d.close();
}
}
