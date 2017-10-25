package selll;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fullscript {

	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
			ChromeDriver d = new ChromeDriver();
			d.get("http://toolsqa.com/automation-practice-form/");
			d.manage().window().maximize();
			d.findElement(By.name("firstname")).sendKeys("sunil");
			Thread.sleep(2000);
			d.findElement(By.name("lastname")).sendKeys("H N");
			Thread.sleep(2000);
			d.findElement(By.id("sex-0")).click();
			Thread.sleep(2000);
			d.findElement(By.id("exp-0")).click();
			Thread.sleep(2000);
			d.findElement(By.id("datepicker")).sendKeys("12/07/2017");
			Thread.sleep(2000);
			d.findElement(By.name("profession")).click();
			Thread.sleep(2000);
			d.findElement(By.id("tool-2")).click();
			Thread.sleep(2000);
			Select s = new Select(d.findElement(By.id("continents")));
			Thread.sleep(2000);
			s.selectByVisibleText("Australia");
			s.selectByVisibleText("Asia");
			Thread.sleep(2000);
			String s3=d.findElement(By.xpath(".//*[@id='content']/form/fieldset/div[13]/p/strong/label")).getText();
			System.out.println(s3);
			Select s1 = new Select(d.findElement(By.id("selenium_commands")));
			boolean b = s1.isMultiple();
			if (b == true) {
				System.out.println("multipul");
				Thread.sleep(2000);
				s1.selectByVisibleText("Navigation Commands");
				Thread.sleep(2000);
				s1.selectByVisibleText("Switch Commands");
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
