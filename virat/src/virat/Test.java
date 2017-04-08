package virat;

import java.util.logging.Logger;

//package Cross;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
	static Logger log=Logger.getLogger(Test.class.getName());
	
		public static void main(String[] args)  {
		log.info("initializing webdriver");
			WebDriver driver=new FirefoxDriver();
		log.info("maximizing window");
			driver.manage().window().maximize();
			log.info("opening gmail");
		driver.get("http://www.gmail.com/");
		driver.findElement(By.xpath(".//*[@id='link-signup']/a")).click();
		driver.findElement(By.name("FirstName")).sendKeys("Karthik");
		driver.findElement(By.xpath(".//*[@id='BirthMonth']/div")).click();
		driver.findElement(By.xpath(".//*[@id=':5']")).click();
		driver.close();
		
	}

}


