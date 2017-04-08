package virat;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.testng.annotations.AfterClass;

public class createfile 
{
	WebDriver driver;
  @Test
  public void f() throws InterruptedException, IOException 
  {
	 
	  File f=new File("E:\\tmp.txt") ;
	  f.createNewFile();
	   
	  FileWriter w=new FileWriter(f);
	  BufferedWriter out=new BufferedWriter(w);
	  out.write("hello world");
	  out.newLine();
	  out.write("hello new world");
	  out.flush();
  }
  @BeforeClass
  public void beforeClass() 
  {
	

  }

  @AfterClass
  public void afterClass() {
	  
  }

}
