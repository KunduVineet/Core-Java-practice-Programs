package in.vk.main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx1 {
	
	public static void main(String[] args) {
		String regex = "ab*ab";
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher("aaaaaaab");
		boolean matches = matcher.matches();
		
		System.out.println("result : "+ matches);
	}
	
}
