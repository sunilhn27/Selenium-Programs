package mock1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class labelnames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("http://www.gcrit.com/build3/create_account.php");
		List<WebElement> wb=d.findElements(By.className("fieldKey"));
		List<String>al=new ArrayList<String>();
		al.add("Gender:");
		al.add("First Name:");
		al.add("Last Name:");
		al.add("Date of Birth:");
		al.add("E-Mail Address:");
		al.add("Company Name:");
		al.add("Street Address:");
		al.add("Suburb:");
		al.add("Post Code:");
		al.add("City:");
		al.add("State/Province:");
		al.add("Country:");
		al.add("Telephone Number:");
		al.add("Fax Number:");
		al.add("Newsletter:");
		al.add("Password:");
		al.add("Password Confirmation:");
		Iterator<String> i=al.iterator();
		String txt1="";
		while(i.hasNext()){
			txt1=i.next();
			System.out.println(txt1);
		
		for(WebElement li:wb){
			String s=li.getText();
			System.out.println(s);
			if(s==txt1){
				System.out.println("mayhed");
			}
			else{
				System.out.println("not mached");
			}
		
		}		
		}
		
	
		
}}

