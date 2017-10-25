package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;

public class log1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		Logger l=Logger.getLogger("log1");
		PropertyConfigurator.configure("log4j.Properties");
		ChromeDriver d = new ChromeDriver();
		l.info("launching the browser");
		d.manage().window().maximize();
		l.info("maximize the window");
		d.close();
		l.info("closing the browser");
		String s=l.getName();
		System.out.println(s);
	}

}
