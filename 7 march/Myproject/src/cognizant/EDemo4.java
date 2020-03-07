package cognizant;

import java.io.FileReader;
import java.io.IOException;

public class EDemo4 {
	public void readData() throws IOException
	{
		FileReader fr = new FileReader("empData.txt");
		int i =fr.read();
		System.out.println("hi" + i);
	}
public void task2() throws IOException
{
readData();
}

	public static void main(String[] args) {
	 EDemo4 demo4 = new EDemo4();
	 try {
		demo4.task2();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	 System.out.println("End of main");
	}

}
