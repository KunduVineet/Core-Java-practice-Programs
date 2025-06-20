package in.vk.main;

public class Volatile {

	private volatile boolean isRunning = true;
	
	public void stopServer() {
		isRunning = false;
	}
	
	public void workerTask() {
		while(isRunning) {
			System.out.println("Worker Thread is processing");
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				Thread.currentThread().interrupt();
			}
		}
		System.out.println("Worker thread stopped");
	}
	
	public static void main(String[] args) throws InterruptedException {
        Volatile server = new Volatile();
        Thread worker = new Thread(server::workerTask);
        worker.start();

        Thread.sleep(3000); // Simulate server running for 3 seconds
        server.stopServer(); // Control thread initiates shutdown
    }
}
