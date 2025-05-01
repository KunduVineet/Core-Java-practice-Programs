package in.vk.main;

interface interf {
	public void m1();
}

public class LambdaExpression {
	public static void main(String[] args) {
		interf i = () -> System.out.println("Lambda Expression Implementation");
		i.m1();
	}
}
