package in.vk.main;

import java.util.function.Function;

public class Function3 {
	
	public static void main(String[] args) {
		String s = "Hello, This is Vineet Kundu, learning Java 8";
		
		Function<String, String> f = n -> n.replace(" ", "");
		
		System.out.println(f.apply(s));
	}

}
