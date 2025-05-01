package in.vk.main;

interface interf {
	public void m1();
}

interface i2{
	public void add(int a, int b);
}

interface length{
	public int getLength(String s);
}

public class LambdaExpression {
	public static void main(String[] args) {
		interf i = () -> System.out.println("Lambda Expression Implementation");
		i.m1();
		i2 x = (a,b) -> System.out.println("The Sum is "+(a+b));
		x.add(34, 5);
		x.add(90, 0);
		
		length o = s -> s.length();
		System.out.println(o.getLength("Hello"));
		System.out.println(o.getLength("Invoking Lambda expression"));

	}
}
