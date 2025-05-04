package in.vk.main;

public class Multi extends Thread {
    public void run() {
        System.out.println("Thread running");
    }
    
    public static void main(String[] args) {
    	Multi thread = new Multi();
    	thread.start();
	}
}
