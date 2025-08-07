package in.vk.main;

interface interf{
	public static void m1() {
		System.out.println("Static Interface Method");
	}
}
public class StaticMethod implements interf{
	public static void main(String[] args) {
		StaticMethod t = new StaticMethod();
		//t.m1();
		//StaticMethod.m1();
		interf.m1();
	}

}
