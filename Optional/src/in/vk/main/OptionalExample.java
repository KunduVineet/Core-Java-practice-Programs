package in.vk.main;

import java.util.Optional;

public class OptionalExample {
	public static void main(String[] args) {
		String str = null;
		Optional<String> optional = Optional.ofNullable(str);
		System.out.println(optional.isPresent());
	}

}
