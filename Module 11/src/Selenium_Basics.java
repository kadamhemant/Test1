import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

// firefox.exe -p profilemanager
public class Selenium_Basics {

	
	public static void main(String[] args) {
		// cntrl + shift  + o
		// 18
		
		// find the binary
		//FirefoxBinary binary = new FirefoxBinary(new File("C:\\Program Files\\Mozilla Firefox 4.0 Beta 8\\firefox.exe")); 
		//FirefoxDriver driver1 = new FirefoxDriver(binary, null);
		
		
		
		//FirefoxDriver driver = new FirefoxDriver();
		
		
		// Chrome
		//System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		//ChromeDriver d1 = new ChromeDriver();
		
		// IE - protected mode as at same level
		// download exe
		//System.setProperty("webdriver.ie.driver", "H:\\IEDriverServer.exe");
		//InternetExplorerDriver ie = new InternetExplorerDriver();
		
		
		
		
	}

}
