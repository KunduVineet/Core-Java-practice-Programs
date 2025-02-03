package in.vk.main;

import java.util.Scanner;

public class ReverseStringBuilder {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number which you want to Reverse: ");
		int n = sc.nextInt();

		String reverse = new StringBuilder(String.valueOf(n)).reverse().toString();

		System.out.println("Reversed Number : " + reverse);
		sc.close();
	}

}
