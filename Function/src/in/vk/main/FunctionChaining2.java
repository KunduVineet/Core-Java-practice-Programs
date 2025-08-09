package in.vk.main;

import java.util.function.Function;

public class FunctionChaining2 {	
		public static void main(String[] args) {
			Function<Integer, Integer> f = s -> s+s;
			Function<Integer, Integer> d = s -> s*s*s;
			
			System.out.println(f.apply(3));
			System.out.println(d.apply(3));
			System.out.println(f.andThen(d).apply(3));	// 3+3 == 6, 6*6*6 = 216
			System.out.println(f.compose(d).apply(3));	//3*3*3 == 27, 27+27 = 54
			System.out.println(d.andThen(f).apply(3));	//3*3*3 == 27, 27+27 = 54
			System.out.println(d.compose(f).apply(3));	// 3+3 == 6, 6*6*6 = 216

		}


}
