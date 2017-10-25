package Groups;

import org.testng.annotations.Test;

public class groupdependency {

	@Test(groups = { "A" })
	public void log() {
		System.out.println(" iam in smoke testing");

	}

	@Test(groups = { "B", }, dependsOnGroups = "A")
	public void log1() {
		System.out.println(" iam in sanity testing");

	}

	@Test(groups = { "C" })
	public void log2() {
		System.out.println(" iam in regression testing");

	}

	@Test(groups = { "D" }, dependsOnGroups = "C")
	public void log3() {
		System.out.println(" iam in integrationtesting");

	}

	@Test(groups = { "E" })
	public void green() {
		System.out.println("hi");
	}

	@Test(groups = { "F" }, dependsOnGroups = "E")
	public void yellow1() {
		System.out.println("hi");
	}
}
