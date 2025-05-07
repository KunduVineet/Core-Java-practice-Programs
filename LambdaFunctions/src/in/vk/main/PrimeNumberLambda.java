package in.vk.main;

import java.util.Scanner;

interface Prime{
	public boolean pr(int n, int d);
}

public class PrimeNumberLambda {
	
	public static void main(String[] args) {
		Prime p = (n,d) -> {
			if(n < 2) return false;
			if(n % 2 == 0) return false;
			
			for(int i = 2; i*i <= n; i++) {
				if(n % i == 0)
					return false;
			}
			return true;				
	};
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number which you want to check");
	int n = sc.nextInt();
	
	System.out.println(n +" is prime : " + p.pr(n, 2));
	
	}
}
