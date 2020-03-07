package com.cts.training.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemoPs {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			/*System.out.print("Enter Employee id : ");
		int id =  Integer.parseInt(br.readLine());
		
		System.out.print("Enter Employee Name : ");
		String name =br.readLine();

	System.out.print("Enter Employee Address : ");
		String address =br.readLine();
		
		System.out.print("Enter Employee Age : ");
		int age =  Integer.parseInt(br.readLine());
		
		System.out.print("Enter Employee Phone : ");
		long phone =  Long.parseLong(br.readLine());*/
		
		
		Class.forName("com.mysql.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/ctspune";

		Connection conn = DriverManager.getConnection(url, "root", "ROOT");
		//String query = " insert into employee values(?,?,?,?,?)";
		//String query = " update employee set name = ? where id = ?";
		//String query = " delete from employee  where id = ?";
		String query = "select * from employee ";
		PreparedStatement ps = conn.prepareStatement(query);
		//Statement stmt = conn.createStatement();
//		ps.setString(1, name);
//		ps.setInt(2, id);
	//ps.setInt(1, id);
			//ps.setString(2, name);
		/*ps.setString(3, address);
		ps.setInt(4, age);
		ps.setLong(5, phone);*/
			
			ResultSet rs = ps.executeQuery(query);
			int i=1;
			while(rs.next())
			{
			
				System.out.println("Employee " + i + " Record....!!!");
                System.out.println("Id : " + rs.getInt(1)); 
                System.out.println("Name :" + rs.getString(2)); 
                System.out.println("Address:" + rs.getString(3));
                System.out.println("Age:" + rs.getInt(4));
                System.out.println("Phone:" + rs.getLong(5));
              i++;
                
                
                /*//int id = rs.getInt(1); 
				int id = rs.getInt("id");
				String name=rs.getString(2);
				String address=rs.getString(3);
				int age=rs.getInt(4);
				long phone= rs.getLong(5);
				System.out.println(id + " : " + name + " : " + address + " : " + age + " : " + phone );
			
				*/
				
			}
			
			
			
			
		/*	
		int result = ps.executeUpdate();
		if (result > 0)
		{
			System.out.println("Data Inserted Successfully!");

		} else
		{
			System.out.println("Something went wrong..");
		}*/
		
	}

}
