package in.vk.main;

import java.util.Scanner;

public class Java2 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter First number");
			int n1 = sc.nextInt();

			System.out.println("Enter Second number");
			int n2 = sc.nextInt();

			System.out.println("Choose your operation : + - * / %");
			String op = sc.next();

			double ans;

			switch (op) {
			case "+":
				ans = n1 + n2;
				System.out.println("Desired output is : " + ans);

				break;
			case "-":
				ans = n1 - n2;
				System.out.println("Desired output is : " + ans);
				break;
			case "*":
				ans = n1 * n2;
				System.out.println("Desired output is : " + ans);
				break;
			case "/":
				ans = n1 / n2;
				System.out.println("Desired output is : " + ans);
				break;
			case "%":
				ans = n1 % n2;
				System.out.println("Desired output is : " + ans);
				break;
			default:
				// Code block if no case matches
				System.out.println("Unidentified Statements");
				break;
			}
		}

	}

}
