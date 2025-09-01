package in.vk.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class demo {
	public static void main(String[] args) {
		var list = new ArrayList<Integer>();
		list.add(100);
		list.add(101);
		list.add(102);
		
		List<Integer> result = list.stream().collect(Collectors.toUnmodifiableList());
		System.out.println(result);
		
		List<Integer> re = List.copyOf(list);
		re.add(900);
		System.out.println(re);

	}

}
