package com.cts.training.serialization;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void serialize(Employee employee , String path){
		
		
		try {
			FileOutputStream fout = new FileOutputStream(path);
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			ObjectOutputStream oos = new ObjectOutputStream(bout);
			oos.writeObject(employee);
			oos.close();
			bout.close();
			fout.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {

				e.printStackTrace();
		

		}

	}
	
	public static Object desrialize(String filePath)
	{
		try {
			FileInputStream fin = new FileInputStream(filePath);
			BufferedInputStream bin = new BufferedInputStream(fin);
			ObjectInputStream oin = new ObjectInputStream(bin);
			Object obj = oin.readObject();
			oin.close();
			return obj;
		} catch (FileNotFoundException e) {
				e.printStackTrace();
		} catch (IOException e) {
		e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) {
		
//		Employee employee = new Employee(101,"Nikhil","Mumbai", 22, 987456321, "SD", 30000);
//		serialize(employee, "employee.txt");
//		System.out.println("Object Saved Successfully");
		
		Employee employee = (Employee) desrialize("employee.txt");
		System.out.println(employee);
	}

}
