package datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class picker1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.redbus.in/online-booking/apsrtc.aspx?gclid=EAIaIQobChMIq86Kx8em1QIVkwYqCh159wTyEAAYASAAEgLxyfD_BwE");
		WebElement wb=d.findElement(By.id("txtOnwardCalendar"));
		wb.click();
		WebElement wb1 =d.findElement(By.id("rb-next-middle"));
		WebDriverWait w=new WebDriverWait(d,20);
		w.until(ExpectedConditions.elementToBeClickable(wb1));
		//wb1.click();
		d.findElement(By.xpath(".//*[@id='rb-calmiddle']/ul[2]/li[10]/span")).click();

	}

}
