package in.vk.main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class dropWhile {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2,3,4,5,6,7,8,9,10);
		
		List<Integer> result = numbers.stream().filter(n -> n% 2 == 0).collect(Collectors.toList());
		System.out.println(result);
		
		List<Integer> reslt = numbers.stream().takeWhile(n -> n% 2 == 0).collect(Collectors.toList());
		System.out.println(reslt);
		
		List<Integer> rest = numbers.stream().dropWhile(n -> n% 2 == 0).collect(Collectors.toList());
		System.out.println(rest);
	}
}
