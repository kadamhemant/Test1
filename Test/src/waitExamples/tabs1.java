package waitExamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class tabs1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProfilesIni prof  = new ProfilesIni();
		FirefoxProfile p = prof.getProfile("HK");
		FirefoxDriver driver = new FirefoxDriver(p);
		
		driver.get("http://www.rediff.com/");
		
		Set<String> s = driver.getWindowHandles();
		Iterator<String> itr= s.iterator();
		//System.out.println(itr.hasNext());
		//System.out.println(itr.hasNext());
		String mainWindowid= itr.next();
		String subWinID=itr.next();
		System.out.println(mainWindowid);
		System.out.println(subWinID);
		driver.switchTo().window(subWinID);
		driver.close();
		driver.switchTo().window(mainWindowid);
		driver.findElement(By.xpath("//*[@id='new_design']/div[4]/div[1]/a[1]/div")).click();
		
	}

}
