package com.test;

import java.util.Collections;
import java.util.PriorityQueue;

class Student
{
		
	int id;
	String name;
	int marks;
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	
}

public class PriorityQueueTest {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		
		pq.add(30);
		pq.add(23);
		pq.add(11);
		pq.add(67);
		pq.add(2);
		pq.add(6);
		pq.add(89);
		
		pq.offer(63);
		
		System.out.println(pq);
		
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		
		
		System.out.println(pq);
		
		pq.remove(89);
		
		System.out.println(pq);
		System.out.println(pq.size());

		System.out.println(pq.isEmpty());
		
		PriorityQueue<Integer> pq1=new PriorityQueue<Integer>(Collections.reverseOrder());
		
		
		pq1.add(30);
		pq1.add(23);
		pq1.add(11);
		pq1.add(67);
		pq1.add(2);
		pq1.add(6);
		pq1.add(89);
		
		System.out.println(pq1);
		
		
		PriorityQueue<Student>  studentPQ=new PriorityQueue<Student>(
				(a,b)->a.marks-b.marks
				);

		
		studentPQ.offer(new Student(1,"John",80));
		studentPQ.offer(new Student(2,"David",60));
		studentPQ.offer(new Student(3,"Mike",90));
		
		for(Student s:studentPQ)
		{
			
			System.out.println(s.name+" "+s.marks);
			
		}
	}

}
