package in.vk.main;

import java.util.Scanner;

public class Factroial {
	public static int factroial(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		
		return n*factroial(n-1);
	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number :");
		int n = sc.nextInt();
		
		if(n<0) {
			System.out.println("Please try to enter a positive number");
		}	else {
			System.out.println("The factorial of "+n+" is "+ factroial(n));
		}
		sc.close();
	}

}
