package ex07;

import java.util.Arrays;
import java.util.Scanner;

/*
7. Desenvolva um algoritmo que receba 15 valores num�ricos inteiros num vetor X, receba 15 valores num�ricos inteiros num vetor Y
e concatene alternadamente os elementos dos vetores X e Y num terceiro vetor Z de 30 posi��es. Os elementos das posi��es �mpares
do vetor Z s�o os mesmos do vetor X e os elementos das posi��es pares do vetor Z s�o os mesmos do vetor Y. Mostrar os elementos
dos tr�s vetores. 
*/

public class Main {
	public static void main(String[] args) {
		
		int[] arrayX = new int[15];
		int[] arrayY = new int[15];
		int[] arrayZ = new int[30];
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < arrayZ.length; i++) {
			if (i < 15) {
				System.out.println("Insert an integer into X[" + i + "]:");
				arrayX[i] = scanner.nextInt();
			} else {
				System.out.println("Insert an integer into Y[" + i + "]:");
				arrayY[i - 15] = scanner.nextInt();
			}
		}
		
		int counter = 0;
		for (int i = 0; i < arrayZ.length; i++) {
			if ( (i % 2) != 0) {
				arrayZ[i] = arrayX[counter];
				counter ++;
			}
		}
		
		counter = 0;
		for (int i = 0; i < arrayZ.length; i++) {
			if ( (i % 2) == 0) {
				arrayZ[i] = arrayY[counter];
				counter ++;
			}
		}
		
		System.out.println("Array X: " + Arrays.toString(arrayX));
		System.out.println("Array Y: " + Arrays.toString(arrayY));
		System.out.println("Array Z: " + Arrays.toString(arrayZ));
	}
}
