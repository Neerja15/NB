package cognizant;

import java.util.Scanner;

public class Assignment2 {
 public static void main(String[] args) {
	 //String str="Java programming is easy";
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String a = sc.nextLine();
	 String[] words = a.split("\\s");
	 for(String w:words){  
	 System.out.println(w);  
	 }  

}
}
