package virat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;

public class Getmethods {
@Test
public void getColour(){
	WebDriver driver=new FirefoxDriver();
	driver.navigate().to("https://www.google.com");
	String title=driver.getTitle();
	System.out.println(title);
	System.out.println(driver.findElement(By.xpath(".//*[@id='gb_70']")).getCssValue("color"));
	
}
}
