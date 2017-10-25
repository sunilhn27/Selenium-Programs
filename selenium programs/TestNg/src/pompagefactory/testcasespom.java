package pompagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testcasespom {

	webelements w = new webelements();

	@BeforeClass
	public void test() {

		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		w.d = new ChromeDriver();
		w.d.get(webelements.URL);
		w.d.manage().window().maximize();

	}

	@Test
	public void test2() {
		PageFactory.initElements(webelements.d, webelements.class);
		w.testdata();
	}

}
