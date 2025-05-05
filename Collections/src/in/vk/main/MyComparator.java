package in.vk.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		if (o1 > o2)
			return -1;
		else if (o1 < o2)
			return +1;
		else
			return 0;
	}

}

class Test {
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(0);
		l.add(5);
		l.add(15);

		 System.out.println("Before sorting "+l);
	     Collections.sort(l, new MyComparator());
	     System.out.println("After sorting "+ l);
	}
}
