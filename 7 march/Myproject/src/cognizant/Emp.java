package cognizant;

 class Empl {
	private int number;
	private String name, designation, address;
	private long phno;
	

	public int getNumber()
	{
		return number;
	}
	public long getPhno()
	{
		return phno;
	}
	public String getName()
	{
		return name;
	}
	public String getDesignation()
	{
		return designation;
	}	
	public String getAddress()
	{
		return address;
	}

public void setNumber(int number)
{
	this.number=number;
}

public void setPhno(int phno)
{
	this.phno=phno;
}
public void setName(String name)
{
	this.name=name;
}
public void setDesignation(String designation)
{
	this.designation=designation;
}
public void setAddress(String address)
{
	this.address=address;
}




}


class Salary extends Empl
{
	 double basic_pay=5000, da, hra, gross_pay, pf, inctax,netpay;
double calculate() 
 {
	
	    da=(0.30*basic_pay);
		hra=(12.5*basic_pay);
		pf=(0.12*basic_pay);
		inctax=(0.19*basic_pay);
		gross_pay=basic_pay+da+hra;
		netpay=gross_pay-pf;
		return netpay;
		
 }
}

	public class Emp
	{
		public static void main(String[] args) {
				
            Empl e = new Empl();
            e.setNumber(1);
            e.setPhno(985671446);
            e.setName("Neerja");
            e.setDesignation("Analyst");
            e.setAddress("YN Road");
            
            int number=e.getNumber();
            System.out.println(number);
            long phno= e.getPhno();
            System.out.println(phno); 
            String name=e.getName();
            System.out.println(name);
           String designation=e.getDesignation();
            System.out.println(designation);
           String address =e.getAddress();
            System.out.println(address);
            
			Salary s = new Salary();
			s.calculate();
			
			System.out.println("Grosspay=" +s.gross_pay);
			System.out.println("Basic pay=" +s.basic_pay);
			System.out.println("pf=" +s.pf);
			System.out.println("Incometax=" +s.inctax);
			System.out.println("DA=" +s.da);
			System.out.println("HRA=" +s.hra);
			System.out.println("Net pay=" +s.netpay);
		}
	}
	



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

