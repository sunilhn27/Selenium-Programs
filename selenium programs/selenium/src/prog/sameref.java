package prog;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class sameref {
	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.ie.driver", "D:\\suniljar\\ieserver\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();

		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		driver = new ChromeDriver();

	}
}
