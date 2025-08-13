package in.vk.main;

public class MethodRefrence2 {
	
	public void m1() {
		for(int i = 0; i<10; i++) {
			System.out.println("Child Thread");
		}
	}
	public static void main(String[] args) {
		//Lambda Expression
//		Runnable r = () ->{
//			for(int i = 0; i<10; i++) {
//				System.out.println("Child Thread");
//			}
//		};
		
		
		
		
		MethodRefrence2 mr2 = new MethodRefrence2();
		Runnable r = mr2::m1;
		
		Thread m2 = new Thread(r);
		m2.start();
		for(int i = 0; i<10; i++) {
			System.out.println("Main Thread");
		}
	}

}
