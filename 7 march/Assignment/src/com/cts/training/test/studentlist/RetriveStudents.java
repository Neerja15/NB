package com.cts.training.test.studentlist;


	import java.util.ArrayList;


	public class RetriveStudents
	{
		public static void main(String[] args) {
			fetchStudentData();
		}
	    static void fetchStudentData(){
	        StudentData stdata=new StudentData();
	       ArrayList<Student> liststu=stdata.addData();
	          for(Student student:liststu)
	          {
	            System.out.println("Name: " +student.name + "-" +student.phyMarks +" -"+ student.mathsMarks +"-" +student.chemMarks);
	            System.out.println("Total Marks: " +student.total);
	            System.out.println("Percentage:" +student.per);
	          }
	}
	
}
