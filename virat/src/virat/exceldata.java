package virat;

import org.testng.annotations.Test;
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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

@Test
public class exceldata 
{
	WebDriver driver;
	FileInputStream fs;
	Workbook w;
	Sheet s;
  public void f() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
  {
	driver.get("https://www.facebook.com"); 
	readexceldata();
	driver.findElement(By.id("email")).clear();
	driver.findElement(By.id("email")).sendKeys(s.getRow(1).getCell(0).getStringCellValue());
	driver.findElement(By.id("pass")).clear();
	driver.findElement(By.id("pass")).sendKeys(s.getRow(1).getCell(1).getStringCellValue());
	driver.findElement(By.id("u_0_l")).click();
	
	
	if(driver.findElement(By.xpath("//a[@id='u_0_3']")).isDisplayed())
	{
		System.out.println("logged in successfully");
	}
	else
	{
		System.out.println("enter correct credentials");
	}
	
	 
	Thread.sleep(5000);
  }
  public void readexceldata() throws EncryptedDocumentException, InvalidFormatException, IOException
  {
	  String st="C:\\Users\\VIJJU\\Desktop\\fb.xlsx";
	  fs=new FileInputStream(st);
	  w=new WorkbookFactory().create(fs);
	  s=w.getSheet("sheet1");
	  
	  
  }
  @BeforeClass
  public void beforeClass() 
  {
	  driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass()
  {
	  driver.close();
  }

}
