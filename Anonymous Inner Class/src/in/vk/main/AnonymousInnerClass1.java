package in.vk.main;

public class AnonymousInnerClass1 {
	
	public static void main(String[] args) {
		Runnable r = () ->{
			for(int i = 0; i< 10; i++) {
				System.out.println("Child Thread by anonymous Inner Class");
			}
		};
		Thread t = new Thread(r);
		t.start();
		
		for(int i = 0; i< 10; i++) {
			System.out.println("Main Thread by Class");
		}
	}

}
