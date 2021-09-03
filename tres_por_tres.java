package java_For_while_do_while;

import java.util.Scanner;

public class tres_por_tres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int array [][] =new int[3][3];
		int cont = 0;
		for(int i =0; i < 3; i++) {
			for(int j =0; j <3; j++) {
				System.out.println("insira um valor: ");
				array [i][j] = scanner.nextInt();
				if(array [i][j] > 10) {
					cont ++;
				  }
				}
			}
		System.out.println("a matriz tem "+ cont +"numeros maior que 10!");
		
		scanner.close();
		}
		
	}


