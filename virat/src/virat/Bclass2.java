package virat;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bclass2 {
static WebDriver driver;
	public static void main(String[] args) {
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("file:///C:/Users/VIJJU/Desktop/New%20Text%20Document.html");
	
	


String sColValue = "Licensing";
 
	//First loop will find the 'ClOCK TWER HOTEL' in the first column
	for (int i=1;i<=3;i++){
		String sValue = null;
		sValue = driver.findElement(By.xpath(".//html/table/tbody/tr[1]/th["+i+"]")).getText();
		if(sValue.equalsIgnoreCase(sColValue)){
			
			// If the sValue match with the description, it will initiate one more inner loop for all the columns of 'i' row 
			for (int j=1;j<=2;j++){
				String sRowValue= driver.findElement(By.xpath(".//*[@id='post-2924']/div/table/tbody/tr["+j+"]/td["+i+"]")).getText();
				System.out.println(sRowValue);
			}
		break;
	}
}
	
	driver.close();
	}

}
