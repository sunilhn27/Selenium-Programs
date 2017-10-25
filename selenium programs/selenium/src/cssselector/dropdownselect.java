package cssselector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownselect {

	public static void main(String[] args) {
	
		
			System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
			ChromeDriver d = new ChromeDriver();
			d.get("http://www.gcrit.com/build3/create_account.php");
			WebElement wb=d.findElement(By.cssSelector("option[value='23']"));
			wb.click();
		

	}

}
