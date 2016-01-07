import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class DesiredCapabilities_Example {

	
	public static void main(String[] args) {
		
		DesiredCapabilities capailities = new DesiredCapabilities();
		capailities.setJavascriptEnabled(true);
		//capailities.setCapability(CapabilityType.PROXY, value);
		
		
		FirefoxDriver driver = new FirefoxDriver(capailities);
		
		System.setProperty("webdriver.chrome.driver", "H:\\chromedriver.exe");
		ChromeDriver d1 = new ChromeDriver(capailities);
		
		

	}

}
