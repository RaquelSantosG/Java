package java_For_while_do_while;
/* Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. 
  O programa deve executar os seguintes passos:
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0],A[1]eA[5]
do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha*/

import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
	  
		int A[]=new int[6];
		int soma;
		A[0]=1;A[1]=0;A[2]=5;A[3]=-2;A[4]=-5;A[5]=7;
		
		 soma = A[0]+A[1]+A[5];
		 System.out.println("o resultado da soma é: "+soma);
		 
		 A[4]=100;
		 
		 for(int x=0;x<6;x++)
		 {
			 System.out.println("["+A[x]+"]"); 
		 }
		
		
		
		
		
			
		}
		
		
	}

