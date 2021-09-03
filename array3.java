package java_For_while_do_while;

import java.util.Scanner;

public class array3 {

	public static void main(String[] args) {
		
		int A[]=new int[6];
		int  numero, somapar=0,somaimpar=0;
		
		

	    	  Scanner ler = new Scanner(System.in);  
             
	    	  for(int x=0;x<6;x++) {
	    		  System.out.println("digite o numero ");
	    		    
	    	  A[x]= ler.nextInt();
	      

	           if (A[x] % 2 == 0) {
	           somapar += A[x];
	           }
	           else {
	        	   
	    	           somaimpar += A[x];
	           }
	    	  }
	    	  for(int x=0;x<6;x++) {
	    		  if (A[x] % 2 == 0) {
	    			  System.out.println(A[x]);  
	    		  }
	    	  }
	   	 System.out.println("mostre o numeros pares"+somapar);
	     for(int x=0;x<6;x++) {
   		  if (A[x] % 2 != 0) {
   			  System.out.println(A[x]);  
   		  }
   	  }
	   	 
		 System.out.println("mostre o numeros impar"+somaimpar);
		 
	}

	}
	      
		
