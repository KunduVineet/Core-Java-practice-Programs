package in.vk.main;

import java.util.ArrayList;
import java.util.Collections;

public class MyComparatorLambda {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(0);
		l.add(5);
		l.add(15);

		 System.out.println("Before sorting "+l);
	     Collections.sort(l, (o1 , o2 ) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
	     System.out.println("After sorting "+ l);
	}
}
