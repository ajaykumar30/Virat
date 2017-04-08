package virat;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.internal.Locatable;

import com.gargoylesoftware.htmlunit.javascript.host.geo.Coordinates;
import com.google.common.base.Splitter;
import com.thoughtworks.selenium.webdriven.commands.GetAttribute;

public class DatePicker {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com");
		WebElement element = driver.findElement(By.xpath(".//*[@id='sidebar']/aside[2]/ul/li[6]/a"));

		org.openqa.selenium.interactions.internal.Coordinates co = ((Locatable) element).getCoordinates();
		co.inViewPort();
		element.click();
		List<WebElement> total_frames = driver.findElements(By.tagName("iframe"));
		int i = total_frames.size();
		System.out.println(i);
		WebElement frm = driver.findElement(By.xpath(".//*[@id='content']/iframe"));
		driver.switchTo().frame(frm);
		driver.findElement(By.id("datepicker")).click();

		String date = "19-January";
		String Splitter[] = date.split("-");
		String enterdate = Splitter[0];
		String entermonth = Splitter[1];

		// entering date in date picker

		String month = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']/div/div/span[1]"))
				.getAttribute("innerHTML");

		if (month.equalsIgnoreCase(entermonth)) {
			List<WebElement> dates = driver
					.findElements(By.xpath("//div[@id='ui-datepicker-div']/table/tbody/tr/td/a"));
			for (WebElement dd : dates) {
				System.out.println(dd.getText());
				if (dd.getText().equals(enterdate)) {
					dd.click();
					Thread.sleep(2000);
					return;
				}

			}
		}

		driver.close();
	}

}
