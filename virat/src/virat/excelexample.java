package virat;

import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.html.impl.SelectableTextSelectionDelegate;

import bsh.classpath.BshClassPath.GeneratedClassSource;

import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class excelexample 
{
	WebDriver driver;
	FileInputStream fs;
	Workbook w;
	Sheet s;
  @Test
  public void f() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
  {
	  driver.get("http://newtours.demoaut.com/");
	  driver.findElement(By.xpath("//tr[10]/td/table/tbody/tr/td[2]/font/a")).click();
	  exceldata();
	  for (int i = 1; i <=4; i++) 
	  {
		try
		{
		  driver.findElement(By.xpath("//input[@name='firstName']")).clear();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(s.getRow(i).getCell(0).getStringCellValue());
		driver.findElement(By.xpath("//input[@name='lastName']")).clear();
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(s.getRow(i).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@name='phone']")).clear();
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(s.getRow(i).getCell(2).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='userName']")).clear();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(s.getRow(i).getCell(3).getStringCellValue());
		driver.findElement(By.xpath("//input[@name='address1']")).clear();
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(s.getRow(i).getCell(4).getStringCellValue());
		driver.findElement(By.xpath("//input[@name='city']")).clear();
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys(s.getRow(i).getCell(5).getStringCellValue());
		driver.findElement(By.xpath("//input[@name='state']")).clear();
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys(s.getRow(i).getCell(6).getStringCellValue());
		driver.findElement(By.xpath("//input[@name='postalCode']")).clear();
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(s.getRow(i).getCell(7).getStringCellValue());
		//for dropdown button inputs
		//String cnt=s.getRow(i).getCell(8).getStringCellValue();
		//WebElement dd=driver.findElement(By.xpath("//select[@name='country']"));
		//Select st=new Select(dd);
		driver.findElement(By.xpath("//select[@name='country']")).click();
		driver.findElement(By.xpath("//select[@name='country']")).sendKeys(s.getRow(i).getCell(8).getStringCellValue());
		driver.findElement(By.xpath("//select[@name='country']")).sendKeys(Keys.TAB);
		
		
		
		
	Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(s.getRow(i).getCell(9).getStringCellValue());
		driver.findElement(By.xpath("//input[@name='password']")).clear();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(s.getRow(i).getCell(10).getStringCellValue());
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).clear();
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(s.getRow(i).getCell(11).getStringCellValue());

		driver.findElement(By.xpath("//input[@type='image']")).click();
		Thread.sleep(4000);
		if(driver.findElement(By.xpath("//font/a[@href='mercurysignon.php']")).isDisplayed())
		{
		System.out.println("you are registered sucessfully");
		driver.get("http://newtours.demoaut.com/");
		 driver.findElement(By.xpath("//tr[10]/td/table/tbody/tr/td[2]/font/a")).click();
		}
		}
		catch(Exception e){
			System.out.println("enter valid data");
		}
		}
	 }
  public void exceldata() throws EncryptedDocumentException, InvalidFormatException, IOException
  {
	 String filepath="C:\\Users\\VIJJU\\Desktop\\Facebookcretentials.xlsx";
	 fs=new FileInputStream(filepath);
	 w=WorkbookFactory.create(fs);
	 s=w.getSheet("sheet2");
  }
  @BeforeClass
  public void beforeClass() 
  {
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass() 
  {
	  driver.close();
  }

}
