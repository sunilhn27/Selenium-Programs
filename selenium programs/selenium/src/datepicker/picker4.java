package datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class picker4 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.booking.com/searchresults.html?aid=306395;label=in-bangalore-45nPqyglgT_WORQ7_OaYywS154618435829%3Apl%3Ata%3Ap1700%3Ap2%3Aac%3Aap1t1%3Aneg%3Afi%3Atikwd-1473443958%3Alp9061994%3Ali%3Adec%3Adm;sid=e07ad081746eb86ad4faa404350e48fa;city=-2090174;keep_landing=1;redirected=1;src=city;gclid=CLPN6cWCydQCFcIXaAodpW0Kwg;ptlrs=1");	
		WebElement wb=d.findElement(By.cssSelector(".sb-date-field__display"));
		wb.click();
		Actions a=new Actions(d);
		WebElement wb1=d.findElement(By.xpath(".//*[@id='frm']/div[1]/div/div[1]/div[1]/div/div/div[2]/div[2]/div[3]/div/div/div[1]/table/tbody/tr[5]/td[6]/span"));
		a.moveToElement(wb1);
		a.click();
		

	}

}
