package virat;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class SumofNnumbers 
{
	static int n;
	static int temp=0;
	 public static void main(String[] args) {
		 Scanner in=new Scanner(System.in);
		 System.out.println("enter n: value");
		 n=in.nextInt();
		
		 for (int i= 1; i<=n; i++) {
			temp=temp+i;
			
		}
		 
	
		 System.out.println("sum of"+n+"numbers is:"+temp);
	 }

	}
	
	


