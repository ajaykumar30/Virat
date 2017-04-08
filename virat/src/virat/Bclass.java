package virat;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bclass {
static WebDriver driver;
	public static void main(String[] args) {
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("file:///C:/Users/VIJJU/Desktop/New%20Text%20Document.html");
	List<WebElement> rows=driver.findElements(By.xpath("html/body/table/tbody/tr"));
	List<WebElement> contents=driver.findElements(By.xpath("html/body/table/tbody/tr/child::*"));
	List<WebElement> col=driver.findElements(By.xpath("html/body/table/tbody/tr/td|html/body/table/tbody/tr/th"));
	 String xpath="html/body/table/tbody/tr[i]/td[j]";
	for(int i=0;i<rows.size();i++)
	{
		
		
		for(int j=0;j<col.size();j++){
			for(int k=0;k<contents.size();k++)
			{
		if(contents.get(k).getText().equalsIgnoreCase("selenium"))
		{
			System.out.println(contents.get(k).getText());
			System.out.println(i);
			System.out.println(j);
		}
	}}
	}
	driver.close();
	}

}
