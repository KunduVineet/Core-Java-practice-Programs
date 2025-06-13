package in.vk.main;

import java.util.ArrayList;
import java.util.List;

public class StreamMain1 {

	public static void main(String[] args) {
		
		//create a list and filter all even numbers from list
		List<Integer> list1 =  List.of(2,3,4,5,6,7,8);
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
	}
}
