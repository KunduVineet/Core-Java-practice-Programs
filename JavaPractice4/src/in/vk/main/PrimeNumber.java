package in.vk.main;

import java.util.Scanner;

public class PrimeNumber {
	
	public static boolean isPrime(int num) {
		if(num < 2) return false;
		return isPrimeRecursive(num, 2);
	}
	
	public static boolean isPrimeRecursive(int num, int divisor) {
		if(divisor * divisor > num) return true;
		if(num % divisor == 0) return false;
		
		return isPrimeRecursive(num, divisor + 1);
	}
	public static void main(String args[]) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        if (isPrime(num)) {
	            System.out.println(num + " is a Prime Number.");
	        } else {
	            System.out.println(num + " is NOT a Prime Number.");
	        }

	        sc.close();
	}

}
