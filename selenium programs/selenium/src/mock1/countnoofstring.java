package mock1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class countnoofstring {

	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
			ChromeDriver d = new ChromeDriver();
			d.get("https://www.google.co.in/");
			String s="sunil";
			/*char[] s1=s.toCharArray();
			int a=0;
			String s2="";
			for(int i=0;i<s.length();i++){
			a++;
		 s2=s2+s1[i];
			d.findElement(By.id("lst-ib")).sendKeys(s2);
s2="";
			

	}
			System.out.println(a);*/
			WebElement text=d.findElement(By.id("lst-ib"));
		String s3="";
			for(int i=0;i<s.length()-1;i++)
			{
				s3=s3+s.charAt(i);
					text.sendKeys(s3);
					text.clear();
					s3="";
			}

}
}
