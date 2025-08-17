package in.vk.main;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer2 {
	
	int capacity;
	
	Queue<Integer> queue = new LinkedList<>();

	public ProducerConsumer2(int capacity) {
		this.capacity = capacity;
	}
	
	
	public static void main(String[] args) {
		
		BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(5);
				
		Thread producerThread = new Thread(()->{
			try {
				for(int i = 0; i<15; i++) {
					queue.add(i);
					System.out.println("Produced "+ i);
					Thread.sleep(100);
				}
			} catch (Exception e) {
				// TODO: handle exception
				Thread.currentThread().interrupt();
			}
		});
		

		Thread consumerThread = new Thread(()->{
			try {
				for(int i = 0; i<15; i++) {
					queue.poll();
					System.out.println("Consumed "+ i);
					Thread.sleep(150);
				}
			} catch (Exception e) {
				// TODO: handle exception
				Thread.currentThread().interrupt();
			}
		});
		
		producerThread.start();
		consumerThread.start();
	}
	
	

}
