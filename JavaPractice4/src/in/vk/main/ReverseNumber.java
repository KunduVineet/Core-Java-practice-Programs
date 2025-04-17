package in.vk.main;

import java.util.Scanner;

public class ReverseNumber {
	
	public static int reverse(int num) {
		int reverse = 0;
		while(num != 0) {
			int digits = num % 10;
			reverse = reverse * 10 + digits;
			num /= 10; 
		}
		return reverse;
	}
	
	public static void main( String args []) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number which you want to reverse");
		int n = sc.nextInt();
		
		 int reversedNum = reverse(n); // store result
	        System.out.println("Reversed Number: " + reversedNum); // print it
		
		sc.close();
	}

}
