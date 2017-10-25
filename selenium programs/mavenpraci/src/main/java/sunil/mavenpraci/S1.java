package sunil.mavenpraci;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("http://money.rediff.com/losers/bse/daily/groupa?src=gain_lose");
		List<WebElement> row = d.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th"));
		System.out.println("the total rows are" +   row.size());
		List<WebElement> col = d.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td/a"));
		System.out.println("the total rows are" +   col.size());
		
		for(WebElement li:col){
			String s[]={"HCL Infosystem","SREI Infrastructure","Finolex Industri ","anappuram Finance"};
			for(int i=0;i<4;i++){
				if(li.getText().equalsIgnoreCase(s[i]));
				System.out.println(s[i]);
			}
			break;
		}		// TODO Auto-generated method stub

	}

}
