package in.vk.main;

interface Left{
	default void m1() {
		System.out.println("Left Default Method called");
	}
}

interface Right{
	default void m1() {
		System.out.println("Right Default Method called");
	}
}

public class DefaultMethods implements Left, Right{
	
	public void m1() {
		Left.super.m1();
	}

}
