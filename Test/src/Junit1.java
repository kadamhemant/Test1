import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Junit1 {
   
	@BeforeClass 
	public static void begin(){
		System.out.println("Before everything");
	}
	
	@AfterClass
	public static void end(){
		System.out.println("After everything");
	}
	@Before
	public void TestBegin(){
		System.out.println("Before every test");
		
	}
	
	@After
	public void TestEnd(){
		System.out.println("After every test");
		
	}
	
	
	@Test
	public void testLogin(){		
		// selenium code to execute test login
		System.out.println("Executing login test");
	}
}
