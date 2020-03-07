package com.cts.training.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1.Load Database Driver
		// 1.1
		Class.forName("com.mysql.jdbc.Driver");

		// 1.2

		// Driver driver = new com.mysql.jdbc.Driver();

		// 2. Establish Connection
		String url = "jdbc:mysql://localhost:3306/ctspune";

		Connection conn = DriverManager.getConnection(url, "root", "ROOT");
		System.out.println("Connection Established Successfully");
		System.out.println(conn.getClass().getName());
		Statement stmt = conn.createStatement();

		//String query = "insert into employee values(3,'Vijay','Mumbai',22,9664553210)";
		//String query = "update employee set address='Thane' where id=3";
		//String query = "delete from employee where id='2'";
		String query = "select * from employee";
		
		
		ResultSet rs = stmt.executeQuery(query);
		
		while(rs.next())
		{
			//int id = rs.getInt(1); 
			int id = rs.getInt("id");
			String name=rs.getString(2);
			String address=rs.getString(3);
			int age=rs.getInt(4);
			long phone= rs.getLong(5);
			System.out.println(id + " : " + name + " : " + address + " : " + age + " : " + phone );
			
		}

		/*int result = stmt.executeUpdate(query);
		if (result > 0)
		{
			System.out.println("Record Deleted Successfully!");

		} else
		{
			System.out.println("Something went wrong..");
		}*/
	}

}
