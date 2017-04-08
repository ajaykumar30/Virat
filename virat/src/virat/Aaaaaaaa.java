package virat;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Aaaaaaaa {
	static WebDriver driver;

	public static void main(String[] args) {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/VIJJU/Desktop/New%20Text%20Document%20%283%29.html");
		
		
		List<WebElement> rows=driver.findElements(By.xpath("//table/tbody/tr"));
		
		
		 for(int i=0;i<rows.size();i++)
		 {
			 List<WebElement> colmns=driver.findElements(By.xpath("//table/tbody/tr["+(i+1)+"]/td"));
			 for(int j=0;j<colmns.size();j++)
			 {
				 WebElement element=driver.findElement(By.xpath("//table/tbody/tr["+(i+1)+"]/td["+(j+1)+"]"));
				
				 if(element.getText().equalsIgnoreCase("selenium"))
				 {
					 System.out.println("row num" +(i+1));
					 System.out.println("col num" +(j+1));
					 break;
				 }
			 }
		 }
driver.close();
	}

}
