package virat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowser {
	WebDriver driver;
	
	@Test
	@Parameters("browser")
	public void browsers(String browsername) {
		
		if(browsername.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
		}
		
		else if(browsername.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\VIJJU\\Downloads\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.quit();
	}
	

}
