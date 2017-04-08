package virat;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FacebookLogin {
	WebDriver driver;
	
	@Test
	public void enterValues() throws EncryptedDocumentException, InvalidFormatException, IOException{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
		Readexceldata rd=new Readexceldata();
		driver.get("https://www.facebook.com");
	  rd.readexcel();
		driver.findElement(By.xpath(".//*[@id='email']")).clear();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(rd.s.getRow(1).getCell(0).getStringCellValue());
		driver.findElement(By.xpath(".//*[@id='pass']")).clear();
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(rd.s.getRow(1).getCell(1).getStringCellValue());
		driver.findElement(By.xpath("//input[@id='u_0_l']")).click();
		
		WebElement home=driver.findElement(By.xpath(".//*[@id='u_0_3']"));
		
		if (home.isDisplayed()){
			System.out.println("logged in success fully");
			
		}
		
			else {
				System.out.println("not logged in");}
			
	driver.close();
	}

}
