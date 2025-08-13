package in.vk.main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {
	
	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(2,5,67,89,0,12,45,67,89,99,8,67,54,76);
		System.out.println(l);
		
		List<Integer> l2 = l.stream().filter(n -> n% 2 == 0).collect(Collectors.toList());
		System.out.println(l2);
		
		int sum = l.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
	}
	
		
		
}
