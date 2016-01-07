package pack3;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
//step 1
@RunWith(Parameterized.class)
public class Parameterized_Test {
	//step 2
	// global vars
	String Name;
	String City;
	
	// step 3
	// constructor
	public Parameterized_Test(String Name, String City) {
		this.Name = Name;
		this.City = City;
	}
	
	@Test
	public void checkNameTest(){
		System.out.println("Executing the test with - "+Name + " -- "+ City );
		
	}
	
	// step 4
	@Parameters
public static Collection<Object[]> getData(){
		
		Object data[][] = new Object[3][2];
		// first row
		data[0][0]="Hemant";
		data[0][1]="Pune";
		
		// 2nd row
		data[1][0]="Sujay";
		data[1][1]="Girvi";
		
		// 3rd row
		data[2][0]="KK";
		data[2][1]="Girvi";
		
		return Arrays.asList(data);
	}
	
	}


