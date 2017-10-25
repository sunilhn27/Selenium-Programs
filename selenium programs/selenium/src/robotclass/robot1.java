package robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class robot1 {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://a2plcpnl0757.prod.iad2.secureserver.net:2096");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_U);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_S);
		/*pwd.sendKeys("sunil@065");
		WebElement login=d.findElement(By.id("login_submit"));
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);*/
		

	}

}
