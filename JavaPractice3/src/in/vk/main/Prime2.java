package in.vk.main;

import java.util.Scanner;

public class Prime2 {
	
	public static boolean isPrime(int n) {
		if(n < 2) return false;
		if(n % 2 == 0) return false;
		
		for(int i = 2; i*i <= n; i++) {
			if(n % i == 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
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
