package explicitwait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class w2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://a2plcpnl0757.prod.iad2.secureserver.net:2096/");
		d.manage().window().maximize();
	//	d.switchTo().frame(0);
		WebDriverWait wait=new WebDriverWait(d,10);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt());
		Actions a=new Actions(d);
		WebElement drag=d.findElement(By.id("draggable"));
		
		a.dragAndDropBy(drag, 150, 600);
		a.build().perform();
	}

}
