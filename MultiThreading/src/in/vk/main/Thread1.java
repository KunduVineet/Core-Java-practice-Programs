package in.vk.main;

public class Thread1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("The code is running via Runnable Interace");
	}
	
	public static void main(String[] args) {
		Thread t = new Thread(new Thread1());
		t.start();
	}

}
