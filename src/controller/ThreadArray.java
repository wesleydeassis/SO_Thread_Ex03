package controller;

public class ThreadArray extends Thread {
	
	private int n;
	private int array[][];
	int sum ; 
	
	public ThreadArray(int n, int array[][]) {
		
		this.n = n;
		this.array = array;
		
		
		
	}


	
	@Override
	public void run() {
	     percorrerArray();
	}



	private void percorrerArray() {
		switch (n) {
		case 0:
			 int i = n;

			for(int j=0; j< 5; j++){

			 sum = sum + array [i][j];

			}

			System.out.println("A linha do array �: "+  (i+1) + "� a soma do vetor � :"+ sum);  
			
			break;
			
		case 1:
			 int k = n;

				for(int j=0; j< 5; j++){

				 sum = sum + array[k][j];

				}

				System.out.println("A linha do array �: "+  (k+1) + "� a soma do vetor � :"+ sum); 
			
			break;
			
		case 2:
			
			 int l = n;

				for(int j=0; j< 5; j++){

				 sum = sum + array [l][j];

				}

				System.out.println("A linha do array �: "+  (l+1) + "� a soma do vetor � :"+ sum); 
			
			break;

	
		}
		
	}

}
