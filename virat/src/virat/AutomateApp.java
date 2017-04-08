package virat;

import org.testng.annotations.Test;

import javafx.scene.control.Alert;
import sun.net.www.content.audio.wav;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class AutomateApp {
	static WebDriver driver;

	@Test
	public void f() throws IOException {
		// Reading data from excel
		String filepath = "C:\\Users\\VIJJU\\Desktop\\Facebookcretentials.xlsx";
		FileInputStream fs = new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheet("Details");
		// navigating to application
		driver.get("https://www.facebook.com");
		// entering value in search content field by using excel
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(sheet.getRow(1).getCell(0).getStringCellValue());
		// entering value in search term field by using excel
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(sheet.getRow(1).getCell(1).getStringCellValue());
		// clicking on find button
		driver.findElement(By.xpath(".//*[@id='u_0_o']")).click();

	}

	// verifying the popup window count
	@Test
	public static void main() throws IOException {
		org.openqa.selenium.Alert alt = driver.switchTo().alert();
		String str = alt.getText();
		;
		String i = str.replaceFirst(".*?(\\d+).*", "$1");
		StringComparison sc = new StringComparison();

		if (i.equals(sc.CompareStrings("ajaykumar", "a"))) {
			screenShot();
			System.out.println("Count is correct");

		} else {
			screenShot();
			System.out.println("count is wrong");
		}
	}

	// screenshot method
	@Test
	public static void screenShot() throws IOException {
		File srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File("E:\\selenium\\Screenshots\\" + System.currentTimeMillis() + ".png"));
	}

	@BeforeClass
	@Parameters("browser")
	// we need to pass the parameter vaue=browsername and make threadcount=2
	public void beforeClass(String browsername) {

		if (browsername.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "path of chrome driver");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
