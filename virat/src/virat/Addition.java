package virat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Addition {
	static int a=3;
	static int b=7;
	static int c;
	
	public static void main(String[] args) throws InterruptedException {
		add();
		System.out.println(c);
			}
	
	public static void add(){
			c=a+b;
		}
	}


