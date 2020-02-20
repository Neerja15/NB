package cognizant;

public class Empp implements Comparable<Empp> {

	int id;
	String name;
	String address;
	String designation;
	int age;
	double salary;
	long phone;
	
	public Empp()
	{
		
	}
	
	public Empp(int id, String name, String address, String designation,int age, double salary, long phone)
	{
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.designation=designation;
		this.age = age;
		this.salary = salary;
		this.phone = phone;
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
		//return "Empp [id=" + id + ", name=" + name + ", address=" + address + ", designation=" + designation + ", age="
				//+ age + ", salary=" + salary + ", phone=" + phone + "]";
		return id + " : " + name + " : " + phone +" : " + address + " : " + age;
				
	}

	@Override
	public int compareTo(Empp emp) {
		if(this.age<emp.age)
		{
			return 1;
		}
		else if(this.age == emp.age)
		{
			return 0;
			
		}
		else {
			return -1;
		}
		
	}

	/*@Override
	public int compareTo(Object obj) {
		Empp emp = (Empp)obj;
		return 0;
	}*/  // If generic is not passed then explicitly Empp is passed
	
	
	
}
