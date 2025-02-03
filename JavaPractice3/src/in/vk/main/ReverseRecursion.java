package in.vk.main;

import java.util.Scanner;

public class ReverseRecursion {
	
	public static int  reversed( int n, int reverse) {
		if ( n == 0) {
			return reverse;
		}
		return reversed(n /10, reverse * 10+ n % 10);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number which you want to Reverse: ");
		int n = sc.nextInt();
		
		System.out.println("Reversed Number : "+ reversed(n, 0));
		
		sc.close();
		
	}

}
