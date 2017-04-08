package virat;

import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Color;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.internal.Locatable;

import com.gargoylesoftware.htmlunit.javascript.host.Window;
import com.gargoylesoftware.htmlunit.javascript.host.geo.Coordinates;

public class Aaaa {
	static WebDriver driver;

	public static void main(String[] args) {
	driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("http://www.gmail.com");
String ss=driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/h1")).getText();
System.out.println(ss);
	
driver.close();
	}
	
}
