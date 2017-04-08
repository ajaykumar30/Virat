package virat;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleDatepicker {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/datepicker/");
		WebElement frame = driver.findElement(By.xpath(".//*[@id='content']/iframe"));
		driver.switchTo().frame(frame);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('datepicker').value='06/06/2017'");
		Thread.sleep(3000);
		driver.close();
	}

}
