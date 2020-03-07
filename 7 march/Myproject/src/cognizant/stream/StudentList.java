package cognizant.stream;

import java.util.ArrayList;
import java.util.List;

public class StudentList {


	    public static void main(String[] args) {

	        List studentList = new ArrayList<>();

	        studentList.add("Kratika");
	        studentList.add("Nirali");
	        studentList.add("Priya");
	        studentList.add("Yash");
	        studentList.add("Tanishq");
	        studentList.add("Deepak");
	        studentList.add("Ayush");
	        studentList.add("Raj");
	    
	        Student Alex = new Student("Kratika", 80);
	        Student Albert = new Student("Nirali", 95);
	        Student Brook = new Student("Priya", 75);
	        Student Carlos = new Student("Yash", 73);
	        Student Ira = new Student("Tanishq", 50);
	        Student Jill = new Student("Deepak", 61);
	        Student Lucy = new Student("Ayush", 40);
	        Student Nancy = new Student("Raj", 30);
	
	    
	     
	        for (int i = 0; i < studentList.size(); i++) {
	            if (((Student) studentList.get(i)).getMarks() >80)
	{
		System.out.println("Distinction : " +studentList.get(i));
	            }
	else if(((Student) studentList.get(i)).getMarks() >60&& ((Student) studentList.get(i)).getMarks() >70)
{
	                System.out.println(("FIRST CLASS : " +(Student) studentList.get(i)) );
	            }
else if(((Student) studentList.get(i)).getMarks()>=50)
{
	                System.out.println(("SECOND CLASS : " +(Student) studentList.get(i)));
	            }
else
{
	System.out.println("Fail");
}
	        }
	    }

	    
	}
	class Student {
	    private String name;
	    private int marks;
	    public Student(String name, int marks) {
	        this.name = name;
	        this.marks = marks;
	    }
	    public String getName() {
	        return name;
	    }
	    public int getMarks() {
	        return marks;
	    }
	}

