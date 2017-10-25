package listeners1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {

	static WebDriver d;

	@Test(priority = 1)
	public void url() {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://www.google.co.in");
		d.manage().window().maximize();
		d.findElement(By.xpath(".//*[@id='lst-ib']")).sendKeys("freshersworld login");
		d.findElement(By.xpath(".//*[@class='lsbb']/input[@value='Google Search']")).click();

	}

	@Test(priority = 2, dependsOnMethods = "url")
	public void homepage() {
		d.findElement(By.xpath(".//*[@id='rso']/div[1]/div/div/div/div/h3/a[1]")).click();
	}

	@Test(priority = 3, dependsOnMethods = "homepage")
	public void register() {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.freshersworld.com/user/login");
		d.findElement(By.xpath("//*[@class='view-apply-button font-20 button_orange_sumbit']")).click();
	}

	
	@DataProvider( name = "datas")
	public Object[][] data() {
		return new Object[][] { { "Sunil", "H N", "sunilhn@htmltech.in", "sunil123", "9902955546" } };

	}

	@Test(priority = 5, dataProvider = "datas")
	public void passing(String Fname, String Lname, String Email, String password, String Phno)
			throws InterruptedException {

		d.findElement(By.id("firstname")).sendKeys(Fname);
		d.findElement(By.id("lastname")).sendKeys(Lname);
		d.findElement(By.id("email")).sendKeys(Email);
		d.findElement(By.id("pass")).sendKeys(password);
		d.findElement(By.id("mobile")).sendKeys(Phno);
		WebElement wb = d.findElement(By.id("currentCity"));
		Select s = new Select(wb);
		s.selectByVisibleText("Bangalore");
		WebElement wb1 = d.findElement(By.id("current_sublocation_id"));
		Select s2 = new Select(wb1);
		Thread.sleep(2000);
		s2.selectByVisibleText("Bommanahalli");
		WebElement wb2 = d.findElement(By.xpath(".//*[@id='course']"));
		Select s3 = new Select(wb2);
		s3.selectByVisibleText("BCA");
		Thread.sleep(2000);
		WebElement wb4 = d.findElement(By.id("passYear"));
		Select s4 = new Select(wb4);
		s4.selectByVisibleText("2015");
		d.findElement(By.xpath(".//*[@id='hasWorkExp1']")).click();
		WebElement firstfield = d.findElement(By.xpath(".//*[@id='first']"));
		Select s5 = new Select(firstfield);
		s5.selectByVisibleText("IT Software-Engineer");
	}
}