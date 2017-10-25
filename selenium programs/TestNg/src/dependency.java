import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dependency {
	static WebDriver d;
	@Test
	public void launch() {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		d = new ChromeDriver();
		System.out.println("1");

	}

	@Test(dependsOnMethods="maximize")
	public void username() {
		d.findElement(By.id("user")).sendKeys("sunilhn@htmltech.in");
		System.out.println("2");
	}

	@Test(dependsOnMethods="launch")
	public void maximize() {
		d.get("https://a2plcpnl0757.prod.iad2.secureserver.net:2096/logout/?locale=en");
		d.manage().window().maximize();
		System.out.println("3");
	}

	@Test(dependsOnMethods="click")
	public void password() {
		d.findElement(By.id("pass")).sendKeys("sunil@065");
		System.out.println("4");
	}
	

   @Test(priority = 5)
   public void click(){
	   d.findElement(By.id("login_submit")).click();
	   System.out.println("5");
   }

}

