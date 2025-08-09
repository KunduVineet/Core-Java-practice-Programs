package in.vk.main;

import java.util.function.Function;

public class Function2 {
	
	public static void main(String[] args) {
		Function<Integer, Integer> f = i-> i*i;
		System.out.println(f.apply(90));
	}

}
