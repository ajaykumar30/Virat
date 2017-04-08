package ajay;

//package Cross;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {
	@Test
		public void login() {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gmail.com/");
		driver.findElement(By.xpath(".//*[@id='link-signup']/a")).click();
		driver.findElement(By.name("FirstName")).sendKeys("Karthik");
		driver.findElement(By.xpath(".//*[@id='BirthMonth']/div")).click();
		driver.findElement(By.xpath(".//*[@id=':5']")).click();
		
	}

}


