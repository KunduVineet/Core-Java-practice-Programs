package in.vk.main;

import java.util.Scanner;

public class Java4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number 1");
		int n1 = sc.nextInt();
		System.out.println("Enter number 2");
		int n2 = sc.nextInt();
		System.out.println("Enter number 3");
		int n3 = sc.nextInt();
		
		int largest = (n1 > n2) ? ((n1 >n3)? n1 : n3) : ((n2> n3 )? n2 :n3);
		System.out.println(largest +" is largest among "+ n1+","+n2+" and "+n3);
		sc.close();
	}
}
