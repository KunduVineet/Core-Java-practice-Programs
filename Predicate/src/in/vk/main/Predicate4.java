package in.vk.main;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Predicate4 {
	
	public static void main(String[] args) {
		
		String [] names = {"Katrina","",null, "Kareena", "Alia", "Falana", null,"dimkahna"};
		
		Predicate<String> startsWithK = s-> s != null && s.length() !=0;
		ArrayList<String> list = new ArrayList<String>();
		
		for(String s: names) {
			if(startsWithK.test(s)) {
				list.add(s);
			}
		}
		System.out.println(list);
	}

}
