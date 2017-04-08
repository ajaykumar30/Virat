package virat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;

public class Aaa {
	
	static WebDriver driver;
	public static void main(String[] args) {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		driver=new FirefoxDriver(cap);
		Reporter.log("Application started", true);
	driver.get("https://www.cacert.org/");
	Reporter.log("Application ended", true);
	driver.close();
	}

}
