package in.vk.main;

import java.util.Scanner;

public class Factorial {
	public static int factorial(int num) {
		if( num == 0)
			return 1;
		return num* factorial(num-1);
		}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number");
		int n = sc.nextInt();
		
		int ans = factorial(n);
		System.out.println(ans);
		
		sc.close();
		}

}
