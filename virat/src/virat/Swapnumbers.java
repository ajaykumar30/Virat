package virat;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Swapnumbers 
{
	static int a,b,c;
	 public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter a value:");
		a=in.nextInt();
		
		System.out.println("enter b value:");
		b=in.nextInt();
		
a=a+b;
b=a-b;
a=a-b;
System.out.println(a);
System.out.println(b);




	 }

	}
	
	


