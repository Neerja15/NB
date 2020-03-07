

	package com.cts.training.jdbc;

	import java.sql.Connection;
	import java.sql.Driver;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;


public class JdbcDemoOne {

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
			//String query = "select * from employee";
//String query = "create table student" + "(id int primary key," + "name varchar(50) ," +" age int ,"+ "address varchar(100) ,"+ "class varchar(50))" ;
//			
//			ResultSet rs = stmt.executeQuery(query);
//			String query = "insert into student values(3,'Neerja',22,'Pune','Job')";
//				int result=stmt.executeUpdate(query);
			
	
		//String query = "insert into student values(2,'Tanishq',23,'Pune','12')";
			//String query = "insert into student values(1,'Yash',23,'Indore','11')";
			//String query = "update student set address='Pune' where id=1";
			//String query = "delete from student where id='3'";
			//String query = "alter table student add  pincode int ";
			String query = "update student set pincode=453001 where id=2";
		int result=stmt.executeUpdate(query);
		
		//System.out.println("Creating table");
		/*while(rs.next())
			{
				//int id = rs.getInt(1); 
				int id = rs.getInt("id");
				String name=rs.getString(2);
				String address=rs.getString(3);
				int age=rs.getInt(4);
				long phone= rs.getLong(5);
				System.out.println(id + " : " + name + " : " + address + " : " + age + " : " + phone );
				
			}*/

		/*if (result > 0)
			{
				System.out.println("Record Deleted Successfully!");

			} else
			{
				System.out.println("Something went wrong..");
			}*/
		}

	}


