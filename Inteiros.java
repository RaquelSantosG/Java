package Familia32;

import java.util.Scanner;

public class Inteiros {

	public static void main(String[] args) {
		
		int n1,n2,n3;  //1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		
        Scanner leia = new Scanner(System.in);
        
        System.out.println("\nEntre com a primeira nota: ");
        n1 =leia.nextInt();
        System.out.println("\nEntre com a segunda nota: ");
        n2 =leia.nextInt();
        System.out.println("\nEntre com a terceira nota: ");
        n3 =leia.nextInt();
        
        System.out.println("\nEntre com o numero inteiro: ");
        Scanner Leia = new Scanner(System.in);

        if (n1 > n2 && n1 >n3) {
        	System.out.println("O numero (" +n1+") � o maior!");
        	
        }
        else if (n2 > n1 && n2 >n3)
        	System.out.println("O numero (" +n2+") � o maior!");
        
	    else {
	    	 System.out.println("o numero ("+n3+") � o maior entre os tres!");
	    	 
	     
	    }     
	    	
		
	}

}
