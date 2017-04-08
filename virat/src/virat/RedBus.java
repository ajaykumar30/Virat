package virat;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.google.common.base.Splitter;
public class RedBus {
	static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
	driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//String date="20-Oct 2016";
//String Splitter[]=date.split("-");
//String day=Splitter[0];
//String month_year=Splitter[1];
driver.get("https://www.redbus.in/");
driver.findElement(By.xpath("//section[@id='search']/div/div[1]/div/label")).sendKeys("hyderabad");
driver.findElement(By.xpath("//section[@id='search']/div/div[2]/div/label")).sendKeys("vizag");
driver.findElement(By.xpath(".//*[@id='search']/div/div[3]/div/label")).click();
select_date("Oct 2016","25");
Thread.sleep(2000);
//driver.findElement(By.xpath(".//*[@id='search']/div/div[4]/div/label")).click();
//select_date("Oct 2016", "30");

}
				
public static void select_date(String month_year,String day){
			List<WebElement> cal_data=driver.findElements(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody/tr/td"));
			for (WebElement dd : cal_data) {
					System.out.println(dd.getText());
				if (dd.getText().equalsIgnoreCase(month_year)) {
								for (WebElement d1 : cal_data) {
							if (d1.getText().equalsIgnoreCase(day)) {
								d1.click();
								return;
							}}}}}}
				
			
		
	
	


