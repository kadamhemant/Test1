package pack5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class Dropdown_Example {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProfilesIni prof  = new ProfilesIni();
		FirefoxProfile p = prof.getProfile("HK");
		FirefoxDriver driver = new FirefoxDriver(p);
		
		driver.get("http://timesofindia.indiatimes.com/");
		WebElement droplist1= driver.findElement(By.xpath("//*[@id='cityselection']"));
		droplist1.sendKeys("Pune");
		
		List<WebElement> allOptions=driver.findElements(By.tagName("option"));
		
		System.out.println("Total options in list -> "+ allOptions.size());
	}

}
