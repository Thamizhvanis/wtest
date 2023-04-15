package wtest;

import org.testng.TestNG;


public class wtestmain {

	public static void main(String[] args) {
		TestNG testNg = new TestNG();
		 testNg.setTestClasses(new Class[] {wtest.class});
			testNg.run();

	}

}
