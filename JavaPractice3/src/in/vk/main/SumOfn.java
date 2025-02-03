package in.vk.main;

import java.util.Scanner;

public class SumOfn {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number which you want to Add: ");
	int n = sc.nextInt();
	
	int sum = 0;
	
	while(n != 0) {
		int digits = n % 10;
		sum = sum + digits;
		n/= 10;
	}
	
	System.out.println("The sum of the numbers of is "+ sum);
}

}
