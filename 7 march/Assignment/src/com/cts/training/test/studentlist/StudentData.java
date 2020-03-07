package com.cts.training.test.studentlist;


	import java.util.ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import cognizant.stream.StudentMarks;


	public class StudentData {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		QuestionThird td =new QuestionThird();
		List<Student> list = td.getAllStudent();
		System.out.println("Enter Student rollno");
		int id = Integer.parseInt(br.readLine());
		System.out.println("Enter student Name");
		String nm = br.readLine();
		System.out.println("Enter student marks in english");
		int en = Integer.parseInt(br.readLine());
		System.out.println("Enter student marks in maths");
		int mt = Integer.parseInt(br.readLine());
		System.out.println("Enter student marks in science");
		int sc = Integer.parseInt(br.readLine());
		
		Student std = new StudentMarks(id, nm, en,mt,sc);
		td.addStudent(std);

	
		System.out.println(" display detais of all student");
		System.out.println("Details:");
		list.forEach(System.out::println);
		
	
	
	}

}

//		 ArrayList<Student> addData(){
//			   Student s1=new Student();
//			   s1.name="Kratika";
//			   s1.phyMarks=95;
//			   s1.mathsMarks=100;
//			   s1.chemMarks=90;
//			   s1.total=95+100+90;
//			   s1.per=((s1.total)*100)/300;
//			   Student s2=new Student();
//			    s2.name="Nirali";
//			    s2.phyMarks=80;
//			    s2.mathsMarks=85;
//			    s2.chemMarks=90;
//			    s2.total=80+85+90;
//			    s2.per=((s2.total)*100)/300;
//				   Student s3=new Student();
//				    s3.name="Priya";
//				    s3.phyMarks=70;
//				    s3.mathsMarks=56;
//				    s3.chemMarks=67;
//				    s3.total=70+56+67;
//				    s3.per=((s3.total)*100)/300;
//			   ArrayList<Student> al=new ArrayList<Student>();
//			         al.add(s1);
//			         al.add(s2);
//			         al.add(s3);
//			         return al;
//			  }
	}

