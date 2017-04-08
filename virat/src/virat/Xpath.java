package virat;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		WebElement ss=driver.findElement(By.xpath(".//*[@id='login_form']/table/tbody/tr[1]/td[1]/label//following::input[@id='email']"));
ss.sendKeys("hello");
Thread.sleep(5000);
		driver.close();
	

	}

}
