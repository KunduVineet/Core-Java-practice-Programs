package in.vk.main;

public class Multi2 extends Thread{

	public void i1() {
		System.out.println("This is the program used to cretae thread by extending thread class");
	}
	
	public static void main(String[] args) {
		Multi2 thread = new Multi2();
		thread.start();
		
	}
}
