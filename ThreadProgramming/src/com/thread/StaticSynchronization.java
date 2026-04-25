package com.thread;

class Table
{
	public static synchronized void printTable(int n)
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(n*i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}
}

class Mythread1 extends Thread
{
	public void run()
	{
		Table.printTable(5);
	}
}
class Mythread2 extends Thread
{
	public void run()
	{
		Table.printTable(10);
	}
}
public class StaticSynchronization {

	public static void main(String[] args) {
		
		Mythread1 t1=new Mythread1();
		Mythread2 t2=new Mythread2();
		
		
		t1.start();
		t2.start();
		

	}

}
