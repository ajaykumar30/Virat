package virat;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.base.Splitter;

public class calender {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.tripadvisor.in/");
		driver.findElement(By.xpath("//div[@id='HEAD']/div/div[2]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//input[@id='rt_airportFrom']")).clear();
		driver.findElement(By.xpath("//input[@id='rt_airportFrom']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//input[@id='rt_airportTo']")).sendKeys("Delhi");
		driver.findElement(By.id("date_picker_in_0")).click();
		select_date("december 2016","20");
		driver.findElement(By.xpath("//span[@id='date_picker_out_0']")).click();
		select_date("december 2016","25");
		//String splitter[]=date.split("-");
		//String month_year=splitter[1];
		//String day=splitter[0];
		Thread.sleep(5000);
	}
public static void select_date(String month_year,String day){
	List<WebElement> months_yesr=driver.findElements(By.xpath("//div[@class='calendar']/div[@class='month']/table/thead/tr/th[@class='caption']"));
	
	for (int i = 0; i < months_yesr.size(); i++) {
		 String my = months_yesr.get(i).getText();
		 if (my.equalsIgnoreCase(month_year)) {
			List<WebElement> days=driver.findElements(By.xpath("//div[@class='month']["+(i+1)+"]/table/tbody/tr/td/div"));
			for (WebElement dd : days) {
				System.out.println(dd.getText());
				if (dd.getText().equalsIgnoreCase(day)) {
					dd.click();
					break;
				}}}}
	 driver.findElement(By.xpath(".//*[@id='overlayInnerDiv']/div/div[1]/span[2]")).click();
	 driver.findElement(By.xpath(".//*[@id='overlayInnerDiv']/div/div[1]/span[2]")).click();
	 select_date("december 2016","20");

	 
}

}
