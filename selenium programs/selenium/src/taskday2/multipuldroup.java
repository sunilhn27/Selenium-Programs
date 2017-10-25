package taskday2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multipuldroup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://toolsqa.com/automation-practice-form/");
		Select s = new Select(d.findElement(By.id("selenium_commands")));
		boolean b = s.isMultiple();
		if (b ==true) {

			Thread.sleep(1000);
			s.selectByVisibleText("Switch Commands");
			s.deselectByVisibleText("Switch Commands");
			Thread.sleep(1000);
			s.selectByVisibleText("Wait Commands");
			s.deselectByVisibleText("Wait Commands");
			Thread.sleep(1000);
			s.selectByIndex(1);

		} else {
			d.close();
		}
	}

}
