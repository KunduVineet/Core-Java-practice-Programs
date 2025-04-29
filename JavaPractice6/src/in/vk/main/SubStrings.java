package in.vk.main;

import java.util.Scanner;

public class SubStrings {
	
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the String ");
			String str = sc.nextLine();
			
			int length = str.length();
			
			System.out.println("The Substrings of "+ str + " is :");
			
			for(int i = 0; i< length; i++) {
				for(int j = i; j <= length - i; j++ ) {
					String sub = str.substring(i, i+j);
					System.out.println(sub);
					
				}
			}
		}
	}

}
