package virat;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fibbonacci 
{
	static int num;
	
	 public static void main(String[] args) {
		 Scanner in=new Scanner(System.in);
		 System.out.print("enter n: value");
		 num=in.nextInt();
		 int f1,f2=0,f3=1;
		 
		 for (int i= 1; i<=num; i++) {
			 System.out.println(f3);

		f1=f2;
		f2=f3;
		f3=f1+f2;
			
		}
		 
	
	 }

	}
	
	


