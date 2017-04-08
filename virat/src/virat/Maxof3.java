package virat;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Maxof3 
{
	static int a,b,c;
	 public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("enter a value:");
		a=in.nextInt();
		
		System.out.println("enter b value:");
		b=in.nextInt();
		
		System.out.println("enter c value:");
		c=in.nextInt();
		
if (a>b&&a>c) {
	System.out.println(a+"is greater");
}
	else if (b>c&&b>a) {
		System.out.println(b+"is greater");
		
	}
	
else {
	System.out.println(c+"is greater");
}
}

	}
	
	


