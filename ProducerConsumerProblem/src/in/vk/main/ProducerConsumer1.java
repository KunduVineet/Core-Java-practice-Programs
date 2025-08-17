package in.vk.main;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer1 {
	
	int capacity;
	
	Queue<Integer> queue = new LinkedList<>();

	public ProducerConsumer1(int capacity) {
		this.capacity = capacity;
	}
	
	public synchronized void Producer(int value) throws InterruptedException {
		while(queue.size()== capacity) {
			wait();
		}
		queue.add(value);
		System.out.println("Produced "+ value);
		notifyAll();
	}
	
	public synchronized int Consumer() throws InterruptedException {
		while(queue.isEmpty()) {
			wait();
		}
		int value = queue.poll();
		System.out.println("Consumed "+ value);
		notifyAll();
		return value;
	}
	
	public static void main(String[] args) {
		
		ProducerConsumer1 pc = new ProducerConsumer1(5);
		
		Thread producerThread = new Thread(()->{
			try {
				for(int i = 0; i<15; i++) {
					pc.Producer(i);
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
					pc.Consumer();
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
