package in.vk.main;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number which you want to Reverse: ");
		int n = sc.nextInt();
		
		int reversed = 0;
		
		while(n != 0) {
			int digits = n %10;
			reversed = reversed * 10 + digits;
			n /= 10;		
		}
		
		System.out.println("Reversed Number :"+ reversed);
		sc.close();
	}

}
