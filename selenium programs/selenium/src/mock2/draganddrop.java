package mock2;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrop {

public static void main(String[] args) throws Exception {
	

	System.setProperty("webdriver.chrome.driver","D:\\suniljar\\chromedriver.exe");
	ChromeDriver d=new ChromeDriver();
	d.get("https://my.naukri.com/account/register/basicdetails");
	WebElement wb=d.findElement(By.cssSelector(".action-btn.fresh"));
	wb.click();

	WebElement wb1=d.findElement(By.cssSelector("[name='uploadCV']"));
	wb1.click();
	Runtime.getRuntime().exec("D:\\suniljar\\re.exe");
}}


	

