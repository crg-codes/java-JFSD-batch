package org.test.app.model;

import org.hibernate.annotations.DialectOverride.GeneratedColumns;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int sid;
	public String sname;
	public String city;
	public String email;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String sname, String city, String email) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.city = city;
		this.email = email;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSid() {
		return sid;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", city=" + city + ", email=" + email + "]";
	}

	
	
	

}
