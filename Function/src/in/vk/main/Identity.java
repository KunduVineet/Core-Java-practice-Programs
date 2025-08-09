package in.vk.main;
import java.util.function.*;

public class Identity {
	
	public static void main(String[] args) {
		Function<String,String> f = Function.identity();
		
		System.out.println(f.apply("Vineet"));
	}

}
