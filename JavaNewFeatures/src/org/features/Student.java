package org.features;

public record Student(int id,String name,double marks)
{
	//validation using compact constructor
	public Student
	{
		if(id<=0)
		{
			throw new IllegalArgumentException("Id must be positive");
		}
		
		if(name==null||name.isBlank())
		{
			throw new IllegalArgumentException("name can not be empty");
		}
		
		if(marks<0 || marks>100)
		{
			throw new IllegalArgumentException("Marks must be between 1 and 100");

		}
	}
	
	//custom method
	public String grade()
	{
		if(marks>=90) return "A";
		else if (marks>=75) return "B";
		else if(marks>=50) return "C";
		else return "Fail";
	}
}

