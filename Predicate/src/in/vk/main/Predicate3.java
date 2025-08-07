package in.vk.main;

import java.util.function.Predicate;

public class Predicate3 {
	
	public static void main(String[] args) {
		
		String [] names = {"Katrina", "Kareena", "Alia", "Falana", "dimkahna"};
		
		Predicate<String> startsWithK = s-> s.charAt(0) == 'K';
		
		for(String s: names) {
			if(startsWithK.test(s)) {
				System.out.println(s);
			}
		}
	}

}
