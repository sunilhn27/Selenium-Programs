package explicitwait;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class exclicitalert {

	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
	ChromeDriver d = new ChromeDriver();
	d.get("http://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
	d.manage().window().maximize();
	WebElement wb=d.findElement(By.xpath(".//*[@id='easycont']/div/div[2]/div[3]/div[2]/button"));
	wb.click();
    WebDriverWait a=new WebDriverWait(d,30);
    a.until(ExpectedConditions.alertIsPresent());
    Alert a1=d.switchTo().alert();
   a1.sendKeys("krnjknmjt");
    
   // String s=a1.getText();
    //System.out.println(s);
   // a1.accept();
}
}