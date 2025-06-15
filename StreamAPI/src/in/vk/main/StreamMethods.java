package in.vk.main;

import java.util.List;

public class StreamMethods {

	public static void main(String[] args) {
		
		List<String> names = List.of("Vineet", "Mayank", "Shivam", "Rajan");
		
		names.stream().filter(e->e.startsWith("V")).forEach(e->System.out.println(e));
		
		List<Integer> numbers = List.of(1,2,3,4,11,34,56,46,6,7,8,9,10);
		numbers.stream().map(e->e*e).sorted().forEach(e->System.out.println(e));
		
		System.out.println(numbers.stream().filter(e -> e% 2 == 0).mapToInt(Integer::intValue).sum());
	}
}
