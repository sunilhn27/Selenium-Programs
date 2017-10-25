package Groups;

import org.testng.annotations.Test;

public class group1 {

	@Test(groups={"smoke"})
	public void log(){
		System.out.println(" iam in smoke testing");
		
	}
	@Test(groups={"sanity","smoke"})
	public void log1(){
		System.out.println(" iam in sanity testing");
		
	}
	@Test(groups={"regression"})
	public void log2(){
		System.out.println(" iam in regression testing");
		
	}
	@Test(groups={"integration"})
	public void log3(){
		System.out.println(" iam in integrationtesting");
		
	}
	
		

}
	/*@Test
	public void green(){
		System.out.println("hi");
	}
	
}
	@Test
	public void yellow1(){
		System.out.println("hi");
}}*/