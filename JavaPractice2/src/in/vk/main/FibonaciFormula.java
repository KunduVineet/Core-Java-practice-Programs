package in.vk.main;

import java.util.Scanner;

public class FibonaciFormula {

	public static int fibo(int n) {
		double sqrt = Math.sqrt(5);
		double sq = (1 + sqrt) / 2;
		return (int) Math.round(Math.pow(sq, n) / sqrt);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms: ");
		int n = sc.nextInt();
		sc.close();

		System.out.println("Fibonaci Series");
		for (int i = 0; i < n; i++) {
			System.out.println(fibo(i));
		}
	}

}
