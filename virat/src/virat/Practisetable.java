package virat;


	

	import org.testng.annotations.Test;
	import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterClass;
	public class Practisetable {
	
		WebDriver driver;

		@Test
		public void f() throws InterruptedException {
			driver.get("http://toolsqa.wpengine.com/automation-practice-table/");
		List<WebElement> rows=driver.findElements(By.xpath("//table/tbody/tr"));
			for(int i=0;i<rows.size();i++)
			{
		 List<WebElement> rownames=driver.findElements(By.xpath("//table/tbody/tr["+(i+1)+"]/th"));
			for (int j = 0; j <rownames.size(); j++) 
			{
				if(rownames.get(j).getText().equalsIgnoreCase("clock tower hotel")){
					
		List<WebElement> result=driver.findElements(By.xpath("//table/tbody/tr["+(i+1)+"]/td"));
			for(int k=0;k<result.size();k++)
			{
				System.out.println(result.get(k).getText());
			}
						
				}
			}}
			Thread.sleep(2000);
		}
		@BeforeClass
		public void beforeClass() {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}

		@AfterClass
		public void afterClass() {
			driver.close();
		}

	}


