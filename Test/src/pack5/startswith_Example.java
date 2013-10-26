package pack5;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class startswith_Example {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		ProfilesIni prof  = new ProfilesIni();
		FirefoxProfile p = prof.getProfile("HK");
		FirefoxDriver driver = new FirefoxDriver(p);
		
		driver.get("http://in.yahoo.com/?p=us");
		driver.findElement(By.xpath("//*[@id='p_13838465-p']")).sendKeys("Selenium");
		Thread.sleep(30000);
		String x= driver.findElement(By.xpath("//*[starts-with(@id,'yui_3_4_0_1_138280')]/ul/li[3]/a")).getText();
		System.out.println(x);
		driver.findElement(By.xpath("//*[starts-with(@id,'yui_3_4_0_1_138280')]/ul/li[3]/a")).click();
	}

}
/*
output:-
selenium tutorial

*/