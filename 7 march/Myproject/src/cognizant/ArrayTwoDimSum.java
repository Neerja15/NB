package cognizant;

import java.util.Scanner;

public class ArrayTwoDimSum {

	public static void main(String[] args) {
		int i,j,sumRow=0,sumCol=0,sum=0,sum1=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number of rows: ");
       int row=sc.nextInt();
       System.out.print("Input number of columns: ");
       int col=sc.nextInt();
       System.out.print("Array Elements are: ");
       int a[][]=new int[row][col];  
       System.out.println("Enter elements of matrix a:");
       for( i=0; i<row; i++)
       {
           for( j=0; j<col; j++)
           {
               System.out.print("Element [" + (i+1) + "," + (j+1) + "]  =  ");
               a[i][j]=sc.nextInt();
           }
       }

       System.out.println("Matrix a:");
       for(i=0; i<row; i++){
           for( j=0; j<col; j++){
               System.out.print(a[i][j] + "\t");
           }
           System.out.print("\n");
       }
       
       ArrayTwoDimSum arr= new ArrayTwoDimSum();
       arr.SumRows(a,row,col);
       arr.SumCols(a,row,col);
       arr.SumDiag(a,row,col);
       arr.SumDiv(a,row,col);
       
       row = a.length;  
       col = a[0].length;  
   

	}

	private void SumDiag(int[][] a, int row, int col) {
		int i,j,sum1=0;
	    for(i=0; i<row; i++){
	           for( j=0; j<col; j++){
	              if(i==j)
	              {
	            	  sum1= sum1 +a[i][j];
	              }
	           }
	           System.out.println("Diagonal : " + sum1); 
		}
	}
		
	

	private void SumDiv(int[][] a, int row, int col) {
	      
	       int i,j,sum=0;
	       for(i=0; i<row; i++){
	           for( j=0; j<col; j++){
	              if(a[i][j]%3==0 && a[i][j]%5==0)
	              {
	            	  sum=sum+a[i][j];
	              }
	           }
	           
		}
	       System.out.println("Divisible : " + sum); 
	   
		
	}

	private void SumCols(int[][] a, int row, int col) {
		int i,j,sumCol=0;
		int k = 0;

		for(i = 0; i < col; i++){  
	           sumCol = 0;  
	           for( j = 0; j < row; j++){  
	             sumCol = sumCol + a[i][j]; 
	                     
	           }  
	           k=i+1;  
	           System.out.println("Sum of  col " + k + " : " + sumCol);  
	       }
		
	}

	private void SumRows(int[][] a, int row, int col) {
		int i,j,sumRow=0;

	       for(i = 0; i < row; i++){  
	           sumRow = 0;  
	           for( j = 0; j < col; j++){  
	             sumRow = sumRow + a[i][j];  
	           }  
	           System.out.println("Sum of row "+ (i+1)+ " : " + sumRow);  
	       }  
	}
}

    