package in.vk.main;

import java.util.Scanner;

public class Java3 {
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter number:");
			int n1 = sc.nextInt();

			if((n1 & 1) == 0) {
				System.out.println(n1+ " is an even number");
			}	else {
				System.out.println(n1+ " is an odd number");
			}
		}
		
	}

}
