package in.vk.main;

import java.util.stream.Stream;

public class StreamIterate {
	public static void main(String[] args) {
		Stream.iterate(100, x->x+1).limit(300).forEach(System.out::println);
	}
}
