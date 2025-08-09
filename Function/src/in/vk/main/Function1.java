package in.vk.main;

import java.util.function.*;

public class Function1 {
	public static void main(String[] args) {
		Function<String, Integer> f = s->s.length();
		System.out.println(f.apply("Vineet"));
	}

}
