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

public class Waits {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		WebElement ss=driver.findElement(By.xpath(".//*[@id='fsl']/a[1]"));

		WebDriverWait wait=new WebDriverWait(driver, 15000);
		wait.until(ExpectedConditions.elementToBeClickable(ss));
		ss.click();
		driver.close();
	

	}

}
