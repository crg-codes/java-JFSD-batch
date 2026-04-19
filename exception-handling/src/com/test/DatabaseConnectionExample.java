package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionExample {

	public static void main(String[] args) {

		try
		{
			Connection connection=DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/test",
            "root",
            "root"
					);
			
			System.out.println("Connected!!");
			
			
			
		}
		catch (SQLException e) {

			System.out.println(e.getMessage());
		}
	}

}
