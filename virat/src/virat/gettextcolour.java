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

public class gettextcolour 
{
	WebDriver driver;
  @Test
  public void f() throws InterruptedException 
  {
	  driver.get("https://www.fb.com");
	  String clr=driver.findElement(By.xpath("//div[@id='content']/div/div/div/div/div[2]/div[1]/div[1]/span")).getCssValue("color");
      System.out.println(clr);
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
