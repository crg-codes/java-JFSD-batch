package org.features;
class Employee
{
	private int id;
	private String name;
	private double salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	} 
	
	
}

public class RecordExample {

	public static void main(String[] args) {
		
		Student s1=new Student(101, "John", 88.5);
		Student s2=new Student(102, "Emma", 95.0);
		Student s3=new Student(103, "Alice", 65.5);
		
		//accessor methods
		System.out.println(s1.id()+" "+s1.name()+" "+s1.marks()+" "+s1.grade());
		
		//toString()
		
		System.out.println(s1);
		
		//hashcode 
		System.out.println(s1.hashCode());
		
		try
		{
			Student s=new Student(-1, "", 120);
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e.getMessage());
		}


	}

}
