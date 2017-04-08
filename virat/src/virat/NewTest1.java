package virat;

import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.javascript.host.html.Option;

import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class NewTest1 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.get("http://www.jqueryui.com");
	  driver.findElement(By.xpath("//a[text()='Selectable']")).click();
	 WebElement frame=driver.findElement(By.xpath("//div[@id='content']/iframe"));
	  driver.switchTo().frame(frame);
List<WebElement>	options=  driver.findElements(By.xpath("//ol[@id='selectable']/li"));

for(int i=0;i<options.size();i++)
{
	String ss=options.get(i).getText();
	System.out.println(ss);
	options.get(i).click();
	}
	  
	  Thread.sleep(2000);
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
  }

  @AfterClass
  public void afterClass() {driver.close();
  }

}
