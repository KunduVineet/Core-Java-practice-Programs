package in.vk.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
	public static void main(String[] args) {
		
		//1. blank
		Stream<Object> str =  Stream.empty();
		str.forEach(w->{
			System.out.println(w);
		});
		
		//2. array, object, collection
		String [] names = {"Vineet", "Mayank", "Shivam", "Rajan"};
		Stream<String> str1 = Stream.of(names);
		str1.forEach(w->{
			System.out.println(w);
		});
		
		//3. 
		Stream<Object> streamBuilder = Stream.builder().build();
		
		//4. 
		IntStream str2 =  Arrays.stream(new int[] {2,3,4,5,6,7});
		str2.forEach(e->{
			System.out.println(e);
		});
		
		//5. 
		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(12); 		l2.add(12);
		l2.add(12);
		l2.add(12);
		l2.add(12);
		l2.add(12);

		l2.stream().forEach(e -> {
            System.out.println(e);
        });
	}

}
