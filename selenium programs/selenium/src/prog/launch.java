package prog;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class launch {

	public static void main(String[] args) {

		for (int a = 0; a <= 2; a++) {
			if (a == 1) {
				System.out.println(a);

				System.setProperty("webdriver.ie.driver", "D:\\suniljar\\ieserver\\IEDriverServer.exe");
				InternetExplorerDriver i = new InternetExplorerDriver();

			}
			if (a == 2) {
				System.out.println(a);

				System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
				ChromeDriver d = new ChromeDriver();
			}
		}
	}

}
