package practiceon_25_7;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUpload {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
	ChromeDriver d = new ChromeDriver();
	d.get("https://blueimp.github.io/jQuery-File-Upload/");
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	d.findElement(By.xpath(".//*[@id='fileupload']/div[1]/div[1]/span[1]")).click();
	Runtime.getRuntime().exec("C:\\Users\\Sanddep B\\Desktop\\uploads\\file1.exe");
}
}
