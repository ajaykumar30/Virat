package virat;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class NewTest 
{
	WebDriver driver;
  @Test
  public void f() throws InterruptedException 
  {
	 driver.get("https://www.gmail.com");
	 driver.findElement(By.linkText("Create account")).click();
	 driver.findElement(By.id("FirstName")).sendKeys("kkk");
	 driver.findElement(By.xpath(".//*[@id='BirthMonth']/div")).click(); 
	 List<WebElement> dd=driver.findElements(By.xpath("//div[@class='goog-menu goog-menu-vertical']//div/div"));
	 for (int i = 0; i < dd.size(); i++) {
		WebElement element=dd.get(i);
		 String s= dd.get(i).getText();
		 //System.out.println(dd.get(i).getAttribute("innerHTML"));
		if (s.contentEquals("June")) {
			element.click();
			break;
			}
		 System.out.println(s);
		 Thread.sleep(5000);
}
	  }
  @BeforeClass
  public void beforeClass() 
  {
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass() {
	 driver.close();
  }

}
