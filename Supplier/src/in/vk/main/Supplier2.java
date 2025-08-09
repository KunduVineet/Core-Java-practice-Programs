package in.vk.main;

import java.util.function.Supplier;

public class Supplier2 {
	public static void main(String[] args) {
		Supplier<String> s = () ->{
			String [] s1 = {"Sunny", "Munny", "Chunny","Bunny", "dunny"};
			int x = (int) (Math.random()*4);
			return s1[x];
		};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}

}
