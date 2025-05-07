package in.vk.main;

interface even{
	public String odd(int n);
}
public class EvenOddLambda {

	public static void main(String[] args) {
		even e = (n) -> 
			(n% 2 == 0) ? "Even" : "Odd";
		
			System.out.println(e.odd(30));
	}
}
