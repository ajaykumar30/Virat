package virat;

import java.util.Scanner;

public class Factorial {
static int num;

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter n value:");
		num=in.nextInt();
		int fact=1;
		for (int i =1 ; i <=num; i++) {
			
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
