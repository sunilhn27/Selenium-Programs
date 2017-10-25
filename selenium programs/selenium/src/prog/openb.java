package prog;

import org.openqa.selenium.chrome.ChromeDriver;

public class openb {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.google.co.in/");
		d.manage().window().maximize();
		String s = d.getTitle();
		System.out.println(s);
		d.get("https://www.java.com/en/");
		d.navigate().back();
		
		String s1 = d.getCurrentUrl();
		System.out.println(s1);
		String s2 = d.getPageSource();
		System.out.println(s2);
	}

}
