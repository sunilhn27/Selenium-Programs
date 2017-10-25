package mouseactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tooltip {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\suniljar\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://jqueryui.com/resources/demos/tooltip/default.html");
		WebElement wb=d.findElement(By.className("ui-helper-hidden-accessible"));
		Actions a=new Actions(d);
		a.moveToElement(wb).click();
		
		String s= wb.getText();
		System.out.println(s);
		
		a.build().perform();
		

	}

}
