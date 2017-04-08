package virat;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class practice 
{
  WebDriver driver;
	@Test
  public void f() throws InterruptedException 
	{
		 driver.get("https://www.echo.com");
		
		  driver.close();
  }
  @BeforeClass
  public void beforeClass()
  {
	  driver=new FirefoxDriver();
	 
	  driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
	 
  }

  @AfterClass
  public void afterClass() 
  {
	  driver.close();
  }

}
