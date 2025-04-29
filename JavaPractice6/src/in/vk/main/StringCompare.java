package in.vk.main;

public class StringCompare {
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "lohel";
		String str3 = "hello";
		String str4 = "ohell";

		
		System.out.println(str1.compareTo(str4));
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str3));

	}
	
	
}
