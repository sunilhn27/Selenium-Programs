package TestNgorg;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class timeout {

	static WebDriver d;

	@Test(timeOut = 1000)
	public void A() throws InterruptedException {

		Thread.sleep(2000);
		System.out.println("hello");
	}

	@Test(timeOut = 2000)
	public void B() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("hi");
	}

}