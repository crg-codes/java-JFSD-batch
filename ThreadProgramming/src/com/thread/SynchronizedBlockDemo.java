package com.thread;

class ValueCounter
{
public int count=0;
	
	public void increment()
	{
		
	  synchronized (this) 
	  {
		  count++;
	  }	
		
	}
	
	public int getCount()
	{
		return count;
	}
}


public class SynchronizedBlockDemo {

	public static void main(String[] args) throws InterruptedException {
          ValueCounter counter=new ValueCounter();
		
		Runnable task=()->{
			for(int i=0;i<1000;i++) //1000
			{
				counter.increment();
			}
		};
		
		
		Thread t1=new Thread(task);//1000
		Thread t2=new Thread(task);//1000
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(counter.getCount());//2000
	}

}
