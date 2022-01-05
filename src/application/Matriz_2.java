package application;

import java.util.Locale;
import java.util.Scanner;

public class Matriz_2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o numero de linhas: ");
		int lin = sc.nextInt();
		System.out.print("Digite o numero de colunas: ");
		int col = sc.nextInt();
		
		int [][] mat = new int[lin][col];
		
		for(int i = 0; i<lin; i++ ) {
			for(int j = 0; j<col; j++) { 
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Digite o numero a ser procurado: ");
		int num = sc.nextInt();
		
		for(int i = 0; i<lin; i++ ) {
			for(int j = 0; j<col; j++) { 
				if (mat[i][j] == num) {
					System.out.println("Position " + i +" , " + j);
					if(i>0) {
						System.out.println("Up: " + mat[i-1][j]);
				    }
					if(i<lin-1) {
						System.out.println("Dow: " + mat[i+1][j]);
					}
					if(j>0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if(j<col-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
				}
			}
		}
		
	
	sc.close();
		
	}

}
