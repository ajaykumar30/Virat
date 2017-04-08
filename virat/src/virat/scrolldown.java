package virat;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.testng.annotations.AfterClass;

public class scrolldown 
{
	WebDriver driver;
  @Test
  public void f() throws InterruptedException 
  {
	  driver.get("https://www.fb.com");
	  
	  
	  //using javascript
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  js.executeScript("window.scrollBy(0,2000)", "");
	  
	 
	  //using sendkeys(for web-based scroll down only not for wondow level)
	 driver.findElement(By.xpath("xpath")).sendKeys(Keys.PAGE_DOWN);
	  
	
	 //scroll to specificelement
	  WebElement element=driver.findElement(By.xpath("//div[@id='pageFooter']/div[2]/table/tbody/tr[1]/td[5]/a"));
	  Coordinates co=((Locatable)element).getCoordinates();
	  co.inViewPort();
	  
	  //not working
	  Actions a=new Actions(driver);
	  a.sendKeys(Keys.PAGE_DOWN).perform();
	  Thread.sleep(5000);
  }
  @BeforeClass
  public void beforeClass() 
  {
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
