package in.vk.main;

import java.util.Scanner;

public class FibonaaciSeries {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms : ");
		int n = sc.nextInt();
		sc.close();
		
		int first = 0;
		int second = 1;
		
		System.out.println("Fibonaci Series : "+ first + " "+ second + " ");
		
		for(int i = 0; i<n; i++) {
			int next = first + second;
			System.out.println("Next : "+ next);
			first = second;
			second = next;
		}
		
		
	}

}
