package Groups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class factory2 {

	WebDriver d;
	private String search;

factory2(String search) {
		this.search = search;

	}

	@Test
	public void method() {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("http://www.google.co.in");
		d.manage().window().maximize();
		d.findElement(By.id("lst-ib")).sendKeys(this.search);


	}

	

	public class otherClass {

		@Factory
		public Object[] testdata() {
			return new Object[] { new factory2("searching") };

		}

	}
}
