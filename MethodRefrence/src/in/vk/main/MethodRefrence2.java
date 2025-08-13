package in.vk.main;

public class MethodRefrence2 {
	public static void main(String[] args) {
		Runnable r = () ->{
			for(int i = 0; i<10; i++) {
				System.out.println("Child Thread");
			}
		};
		
		Thread m2 = new Thread(r);
		m2.start();
		for(int i = 0; i<10; i++) {
			System.out.println("Main Thread");
		}
	}

}
