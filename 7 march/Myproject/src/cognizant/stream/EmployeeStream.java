package cognizant.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeStream {

	public static void main(String[] args) {

		ArrayList<Employee1> employees = new ArrayList<>();
		
		addEmployees(employees);
		//1. Employees with age greater than 20
		
		List<Employee1> ageFilter = employees.stream().filter(e -> e.getAge()>20).collect(Collectors.toList());
		System.out.println(" Employees with age greater than 20");
		ageFilter.forEach(System.out :: println);
		
		List<Employee1> nameFilter = employees.stream().filter(e -> e.getName().startsWith("N")).collect(Collectors.toList());
		System.out.println(" Starts with N");
		nameFilter.forEach(System.out :: println);
		
		List<Employee1> salaryMap=employees.stream().map(emp ->{emp.setSalary(emp.getSalary()*1.15);return emp;}).collect(Collectors.toList());
		
	
		System.out.println("Salary increment by 10%");
		salaryMap.forEach(System.out :: println);
		
		List<Employee1> EveFilter = employees.stream().map(emp -> {
			if(emp.getId()%2==0)
			{
				emp.setName("Mr " + emp.getName());
			}else {
				emp.setName("Ms " + emp.getName());
			};
			return emp;
		})
	.collect(Collectors.toList());
		System.out.println("Mr for even and Ms for odd");
		EveFilter.forEach(System.out :: println);
		
		
	}

	private static void addEmployees(ArrayList<Employee1> employees) {

		Employee1 emp1 = new Employee1(6,"Harshita","Indore", 22 , 879963210,"Developer" , 20000);
		Employee1 emp2 = new Employee1(7,"Vijay","Mumbai", 22 , 879963210,"Developer" , 20000);
		Employee1 emp3 = new Employee1(8,"Neeraj","Pune", 25 , 879963210,"Developer" , 20000);
		Employee1 emp4 = new Employee1(9,"Sakshi","Delhi",19, 879963210,"Developer" , 20000);
		Employee1 emp5 = new Employee1(10,"Neha","Banglore", 18 , 879963210,"Developer" , 20000);
		
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
	}

}
