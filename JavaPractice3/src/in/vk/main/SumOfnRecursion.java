package in.vk.main;

import java.util.Scanner;

public class SumOfnRecursion {
	public static int sum(int n, int sum) {
		if(n == 0)
			return sum;
		return sum(n/10, sum+n %10);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number which you want to Add: ");
		int n = sc.nextInt();
		
		System.out.println("Sum :"+ sum(n, 0));
	}

}
