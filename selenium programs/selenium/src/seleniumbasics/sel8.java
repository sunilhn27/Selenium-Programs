package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel8 {
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
	ChromeDriver d = new ChromeDriver();
	d.get("https://www.google.co.in/");
	String s="sunil";
	String s1="";
	for(int i=0;i<s.length()-1;i++){
		System.out.println(s.charAt(i));
		s1=s1+s.charAt(i);
	d.findElement(By.id("lst-ib")).sendKeys(s1);

	}
	
}
}
