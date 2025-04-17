package in.vk.main;

import java.util.Scanner;

public class Palindrome {
	
	public static boolean isPalindrome(String input, int start, int end) {
		if(start >= end) return true;
		 
		if(input.charAt(start) != input.charAt(end)) return false;
		
		return isPalindrome(input, start+1, end-1);
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String");
		String str = sc.next();
		
		if(isPalindrome(str, 0, str.length()-1)) {
			System.out.println("It's a palindrome");
		}	else {
			System.out.println("It's not a palindrome");
		}
	}

}
