package ScreenShots;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot2 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		d.get("https://www.javatpoint.com/java-tutorial");
		d.manage().window().maximize();
		List<WebElement> wb = d.findElements(By.xpath(".//*[@id='smoothmenu1']/ul/li"));
		int s = 0;
		System.out.println(wb.size());
		for (int i = 0; i < wb.size(); i++) {

			wb.get(i).click();
			TakesScreenshot s1 = (TakesScreenshot) d;
			File f = s1.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File("C:\\Users\\Sanddep B\\Desktop\\screenshots\\" + s + ".png"));
			s++;
			d.navigate().to("https://www.javatpoint.com/java-tutorial");
			wb = d.findElements(By.xpath(".//*[@id='smoothmenu1']/ul/li"));
			
		}
	}

}
