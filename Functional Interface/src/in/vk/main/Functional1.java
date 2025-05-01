package in.vk.main;

@FunctionalInterface
interface Functional1 {

	public void m1();
	default void m2() {
		
	}
	public static void m3() {
		System.out.println("hii");
	}
	
}
