package in.vk.main;

import java.util.HashMap;
import java.util.Set;

public class HashMap1 {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		HashMap hm = new HashMap();
		
		hm.put(101, "Deepak");
		hm.put(102, "Deepak");
		hm.put(103, "Deepak");
		
		System.out.println(hm);
		
		Set set = hm.entrySet();
		System.out.println(set);
	}

}
