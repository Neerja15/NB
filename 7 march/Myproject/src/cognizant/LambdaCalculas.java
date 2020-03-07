package cognizant;

public class LambdaCalculas {
public static void main(String[] args) {
	

	Calc add = (a,b) -> a+b;
	System.out.println("Addition :  "+ add.calculate(10, 2));
	Calc sub = (a,b) -> a-b;
	System.out.println("Subtraction :  "+ sub.calculate(10, 2));
	Calc mul = (a,b) -> a*b;
	System.out.println("Multiply :  "+ mul.calculate(10, 2));
	Calc div = (a,b) -> a/b;
	System.out.println("Division : "+ div.calculate(10, 2));
}
}
interface Calc
{
	double calculate(double a, double b);
}