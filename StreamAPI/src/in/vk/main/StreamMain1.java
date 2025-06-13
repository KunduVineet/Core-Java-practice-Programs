package in.vk.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {

	public static void main(String[] args) {
		
		//create a list and filter all even numbers from list
		List<Integer> list1 =  List.of(2,3,4,5,6,7,8,9,0,90,98);
//		list1.add(45);
		System.out.println(list1);
		
		//without stream
		List<Integer> listeven = new ArrayList<Integer>();
		
		for(Integer i : list1) {
			if(i % 2 == 0) {
				listeven.add(i);
			}
		}
		
		System.out.println(listeven);
		
		//using Stream
		
		Stream<Integer> stream = list1.stream();
		List<Integer> newList =  stream.filter(i -> i%2==0).collect(Collectors.toList());
		
		System.out.println(newList);
		
		//using stream - compact way to write
		
		List<Integer> newList2 = list1.stream().filter(i->i%2==0).collect(Collectors.toList());
	
		System.out.println(newList2);
		
		List<Integer> l = list1.stream().filter(i-> i >10).collect(Collectors.toList());
		System.out.println(l);
	}
}
