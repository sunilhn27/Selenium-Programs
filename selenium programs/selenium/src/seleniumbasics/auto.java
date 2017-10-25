package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class auto {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("http://toolsqa.com/automation-practice-form/");
		WebElement drop = d.findElement(By.id("selenium_commands"));
		Select s = new Select(drop);
		boolean b = s.isMultiple();
		System.out.println(b);
		List<WebElement> text = s.getOptions();
		for (WebElement txt : text) {
			System.out.println(txt.getText());
			if (txt.getText().equalsIgnoreCase("Switch Commands")) {
				s.selectByVisibleText("Switch Commands");
				s.selectByVisibleText("Navigation Commands");
				s.selectByVisibleText("Wait Commands");
				s.selectByVisibleText("WebElement Commands");
				Thread.sleep(2000);

			}

		}

	}
}
