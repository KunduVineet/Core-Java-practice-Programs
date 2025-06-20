package in.vk.main;

import java.util.Scanner;

public class P {
	
	public static boolean isPalindrome(String n, int start, int end) {
		if(start >= end) return true;
		
		if(n.charAt(start) != n.charAt(end)) return false;
		
		return isPalindrome(n, start+1, end-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String which you want to check");
		String n = sc.next();
		
		if(isPalindrome(n, 0, n.length()-1)) {
			System.out.println("Yes "+ n + " is a palindrome. ");
		}	else {
			System.out.println("No, it's not a palindrome");
		} 
		sc.close();
	}

}
