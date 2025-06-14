package in.vk.main;

import java.util.ArrayList;
import java.util.List;

public class Generics1 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("asdf");
		list.add("ghjk");
		list.add("qwer");
		list.add("tyui");
		System.out.println(list);
		
		//Object class is top most class of all java classes. 
	}
	
	Object container;
	
	public Generics1(Object container) {
		this.container = container;
	}
	
	public Object getValue() {
		return this.container;
	}

}
