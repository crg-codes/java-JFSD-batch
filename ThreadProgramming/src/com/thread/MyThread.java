package com.thread;

public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("Thread is running..");
		System.out.println(Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {

		MyThread myThread = new MyThread();
		myThread.setPriority(NORM_PRIORITY);
		//myThread.setPriority(10);
		//myThread.setPriority(0);
		myThread.start();

		Thread t = new Thread(() -> {
			System.out.println("Thread using Lambda....");
		});
		
		t.start();

	}

}