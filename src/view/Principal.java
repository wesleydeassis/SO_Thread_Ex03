package view;

import java.util.Random;

import controller.ThreadArray;


public class Principal {

	public static void main(String[] args) {
	
		Random random = new Random();
		int array[][] = new int [3][5]; 
		
		  for (int i=0; i< 3; i++) {
			  for(int j=0; j< 5; j++)
				  array[i][j] = random.nextInt(100);}
		  
		  for(int i=0; i<3; i++)
		  {
		  for(int j=0; j< 5; j++)
		  {
		  System.out.println(array[i][j]+" ");
		  }
		  System.out.println();
		  }
		  System.out.println();
		  
		
						  
		  for(int op =0 ; op < 3; op++){
				
				Thread ThreadArray = new ThreadArray(op, array);
				ThreadArray.start();
			}
	
	
	}
	
	
	

}
