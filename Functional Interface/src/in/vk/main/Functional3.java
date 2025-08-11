package in.vk.main;

@FunctionalInterface
interface fun{
	int sum(int a, int b);
}
public class Functional3 {
	public static void main(String[] args) {
		fun x = (a,b) -> a+b;
		
		int result = x.sum(10,20);
		
		System.out.println("Sum is: " + result);
	}


}
