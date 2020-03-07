package cognizant;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;
class AlphaSort {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Enter a string : ");
        String a = scanner.nextLine();
     
        char[] charArray = a.toCharArray();
     
        for (int i = 0; i < charArray.length; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (Character.toLowerCase(charArray[j]) < Character.toLowerCase(charArray[i])) {
                	{
                		  char temp = charArray[i];
                	        charArray[i] = charArray[j];
                	        charArray[j] = temp;
                	}
                }
            }
        }
   
        System.out.println("Sorted string =  " + String.valueOf(charArray));
    }
  

}