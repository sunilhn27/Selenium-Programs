package datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class picker3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("http://www.shermanstravel.com/travel_search/flights?refer=RKGKW1786064067%7CST-TS-SEM-1-INT-&adhd=Flight+Deals&adpos=1t2&creative=203231843656&device=c&matchtype=b&network=g&gclid=EAIaIQobChMIv-WUx8ym1QIVzggqCh3cmwMqEAAYAiAAEgL2SvD_BwE");
		WebElement wb=d.findElement(By.id("js-flights-depart-date"));
		wb.click();
		WebElement wb1=d.findElement(By.className("ui-datepicker-month"));
		Select a=new Select(wb1);
		a.selectByVisibleText("Oct");
		d.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody/tr[4]/td[7]/a")).click();
		
		
		
		
		

	}

}
