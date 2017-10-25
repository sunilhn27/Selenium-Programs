import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fire {

	
	public static void main(String[] args) {
		
		
		WebDriver d= new FirefoxDriver();
		d.get("http://www.gcrit.com/build3/create_account.php");
	}
}
