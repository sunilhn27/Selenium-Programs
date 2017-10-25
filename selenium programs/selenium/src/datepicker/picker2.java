package datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class picker2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://jqueryui.com/resources/demos/datepicker/default.html");
		WebElement wb=d.findElement(By.id("datepicker"));
		wb.click();
		WebElement wb1=d.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div/a[2]/span"));
		wb1.click();
		d.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[7]/a")).click();

	}

}
