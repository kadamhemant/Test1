package waitExamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProfilesIni prof  = new ProfilesIni();
		FirefoxProfile p = prof.getProfile("HK");
		FirefoxDriver driver = new FirefoxDriver(p);
		WebDriverWait wait = new WebDriverWait(driver,20);
		driver.get("http://www.commonfloor.com/apartments-for-sale-in-india/");
		
		driver.findElement((By.xpath("//*[@id='sale_type_chzn']/a/span"))).click();
		driver.findElement((By.xpath("//*[@id='sale_type_chzn_o_1']"))).click();
		
		/*wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='listing_loader']/img")));
		System.out.println("A");
		// wait for it to disappear  .. 20  sec
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='listing_loader']/img")));
		System.out.println("B");*/
		
		new FluentWait<WebDriver>(driver)
	       .withTimeout(10, TimeUnit.SECONDS)
	       .pollingEvery(5, TimeUnit.SECONDS)
	       .ignoring(NoSuchElementException.class).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='listing_loader']/img")));
		System.out.println("A");
		
		new FluentWait<WebDriver>(driver)
	       .withTimeout(20, TimeUnit.SECONDS)
	       .pollingEvery(5, TimeUnit.SECONDS)
	       .ignoring(NoSuchElementException.class).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='listing_loader']/img")));
		System.out.println("B");
		driver.findElement((By.xpath("//*[@id='results_div']/div[2]/div/div[3]/div[2]/a[3]"))).click();
		
	}

}
