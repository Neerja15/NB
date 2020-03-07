package cognizant.stream;

public class Employee1{




			int id;
			String name;
			String address;
			String designation;
			int age;
			double salary;
			long phone;

			public Employee1() {
			}

			public Employee1(int id, String name, String address, int age,long phone, String designation,double salary ) {
				super();
				this.id = id;
				this.name = name;
				this.address = address;
				this.age = age;
				this.phone = phone;
				this.designation = designation;
				this.salary = salary;
			
			}

			public int getId() {
			
				return id;
			}

			public void setId(int id) {
				this.id = id;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getAddress() {
				return address;
			}

			public void setAddress(String address) {
				this.address = address;
			}

			public String getDesignation() {
				return designation;
			}

			public void setDesignation(String designation) {
				this.designation = designation;
			}

			public int getAge() {
				return age;
			}

			public void setAge(int age) {
				this.age = age;
			}

			public double getSalary() {
				return salary;
			}

			public void setSalary(double salary) {
				this.salary = salary;
			}

			public long getPhone() {
				return phone;
			}

			public void setPhone(long phone) {
				this.phone = phone;
			}

			@Override
			public String toString() {
				return "Id= " + id + ", Name= " + name + ", Address= " + address + ", Designation= " + designation
						+ ", Age= " + age + ", Salary= " + salary + ", Phone= " + phone + "";
			}

			/*@Override
			public String toString() {
				return id + " : " + name + " : " + phone + " : " + designation;

			}*/
			
}
		


