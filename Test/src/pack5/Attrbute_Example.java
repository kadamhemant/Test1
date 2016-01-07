package pack5;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


public class Attrbute_Example {


	
	public static void main(String[] args) {
		
		
		ProfilesIni prof  = new ProfilesIni();
		FirefoxProfile p = prof.getProfile("HK");
		FirefoxDriver driver = new FirefoxDriver(p);
		
		driver.get("http://bbc.com");
		
		String x=driver.findElement(By.xpath("//*[@id='localNews_title_link']")).getAttribute("title");
		System.out.println(driver.getTitle());
		System.out.println("Attribute value of title is "+x);
		String y=driver.findElement(By.xpath("//*[@id='localNews_title_link']")).getText();
		System.out.println("Link text is "+y);
	}


}

/*
 
 
 <a id="localNews_title_link" rev="news|homepage|na|r|t|i|text|headline" href="/news/world/asia/india/" 
 title="Go to News"> India News </a>

Output:-
BBC - Homepage
Attribute value of title is Go to News
Link text is India News

*/
