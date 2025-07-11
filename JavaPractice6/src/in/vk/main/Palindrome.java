package in.vk.main;

public class Palindrome {
	
	public boolean pal(String s) {
		s= s.toLowerCase().replaceAll("[^a-z0-9]", "");
		int left = 0; int right = s.length()-1;
		while(left < right) {
			if(s.charAt(left) != s.charAt(right)) return false;
			left++;
			right--;
		}
		return true;
		
	}
	
	public static void main(String[] args) {
        Palindrome solution = new Palindrome();
        String s = "A man, a plan, a canal: Panama";
        System.out.println("Is palindrome: " + solution.pal(s)); // Output: true
    }

}
