package Basic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTestngAnnotation2 {

	@Test
	public void test1()
	{
		System.out.println("In test1");     //Printed in console and not in OUTPUT folder
		Reporter.log("My Logging test1");   //Printed in emailable report in OUTPUT folder and not in console
		
	}
	
	@Test
	public void test2()
	{
		System.out.println("In test2");
		Reporter.log("My Logging test2");
		
	}
	
}
