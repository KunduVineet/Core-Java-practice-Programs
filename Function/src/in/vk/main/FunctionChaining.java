package in.vk.main;

import java.util.function.Function;

public class FunctionChaining {
	
	public static void main(String[] args) {
		Function<String, String> f = s -> s.toUpperCase();
		Function<String, String> d = s ->s.substring(0,9);
		
		System.out.println(f.apply("Aishwaryaabhi"));
		System.out.println(d.apply("Aishwaryaabhi"));
		System.out.println(f.andThen(d).apply("Aishwaryaabhi"));
		System.out.println(f.compose(d).apply("Aishwaryaabhi"));
		System.out.println(d.andThen(f).apply("Aishwaryaabhi"));
		System.out.println(d.compose(f).apply("Aishwaryaabhi"));

	}

}
