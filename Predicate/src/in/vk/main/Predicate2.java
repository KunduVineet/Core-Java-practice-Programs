package in.vk.main;

import java.util.function.Predicate;

public class Predicate2 {
	
	public static void main(String[] args) {
		int x [] = {0,5,10,15,20,2,4,1,3,7,9,6,8};
		
		Predicate<Integer> p1 = I-> I>10;
		Predicate<Integer> p2 = I-> I % 2 == 0;

		System.out.println("Numbers greater than 10 are ");
		m1(p1,x);
		
		System.out.println("Evens numbers are ");
		m1(p2,x);
		
		System.out.println("Numbers not greater than 10 are ");
		m1(p1.negate(),x);
		
		System.out.println("Numbers greater than 10 and Even are ");
		m1(p1.and(p2),x);
		
		System.out.println("Numbers greater than 10 or Even are ");
		m1(p1.or(p2),x);
	}
	
	public static void m1(Predicate<Integer> p, int [] x) {
		for(int x1:x) {
			if(p.test(x1))
				System.out.println(x1);
		}
		
	}

}
