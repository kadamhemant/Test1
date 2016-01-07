package pack4;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WebDriver1 {

	
	public static void main(String[] args) {
		DesiredCapabilities cap1= new DesiredCapabilities();
		Proxy p1=new Proxy();
		p1.setProxyAutoconfigUrl("http://fixtrue.info/");
		cap1.setCapability(CapabilityType.PROXY, p1);
		FirefoxDriver driver= new FirefoxDriver(cap1);
		//driver.get("http://www.google.co.in");
		System.out.println(driver.getCapabilities().getBrowserName());
		System.out.println(driver.getCapabilities().isJavascriptEnabled());
		System.out.println(driver.getCapabilities().getVersion());
		System.out.println(driver.getCapabilities().getPlatform().toString());
		
	}

}
