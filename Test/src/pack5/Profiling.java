package pack5;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


public class Profiling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ProfilesIni, FirefoxProfile
		
		ProfilesIni prof  = new ProfilesIni();
		FirefoxProfile p = prof.getProfile("HK");
		FirefoxDriver driver = new FirefoxDriver(p);
		driver.get("http://pune.quikr.com/");
		driver.findElement(By.xpath("//*[@id='lodinstatusdivcontent']/a[2]")).click();
		driver.findElement(By.xpath("//*[@id='query']")).sendKeys("Ipad");
		driver.findElement(By.xpath("//*[@id='searchFormIndex']/input[3]")).click();
				
				//driver.close(); // close the firefox window
		//driver.quit(); // close all ff windows associated with driver
	}

}