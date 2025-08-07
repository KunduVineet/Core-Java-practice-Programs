package in.vk.main;

import java.util.function.*;

public class Predicate1 {
	
	public static void main(String[] args) {
		Predicate<Integer> p = I-> I>10;
		System.out.println(p.test(100));
		System.out.println(p.test(1));
		System.out.println(p.test(10));

		
	}

}
