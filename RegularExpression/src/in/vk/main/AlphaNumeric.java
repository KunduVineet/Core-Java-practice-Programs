package in.vk.main;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlphaNumeric {
	
	public static void checkStringAgainstRE(String re, String str) {
		Pattern pattern = Pattern.compile(re);
		Matcher matcher = pattern.matcher(str);
		boolean matches = matcher.matches();
		System.out.println(matches);
	}

	public static void main(String[] args) {
		
		while(true) {
			System.out.println("Enter Regular Expression");
			Scanner sc = new Scanner(System.in);
			String re = sc.nextLine();
			
			System.out.println("Enter your String");
			String str = sc.nextLine();
			
			checkStringAgainstRE(re, str);		
			
			System.out.println("Want to exit [Y/N]");
			String choice = sc.nextLine();
			if(choice.equalsIgnoreCase("Y")) {
				break;
			}
		}
		
	}
}
