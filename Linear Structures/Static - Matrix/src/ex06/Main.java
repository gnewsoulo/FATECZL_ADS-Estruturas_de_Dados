package ex06;

import java.security.SecureRandom;
import java.util.Arrays;

/*
6. Desenvolva um algoritmo que receba 49 valores numéricos inteiros numa
matriz de dimensões 7x7, calcule e mostre os números pares, suas posições e
a soma dos números pares, bem como os números ímpares, suas posições e a
quantidade de números ímpares.
*/

public class Main {
	public static void main(String[] args) {
		
		SecureRandom random = new SecureRandom();
		
		int[][] base = new int[7][7];
		String evens = "[";
		String evenPos = "[";
		int evenSum= 0;
		String odds = "[";
		String oddPos = "[";
		int oddQt = 0;
		

		for (int i = 0; i < base.length; i++) {
			for (int j = 0; j < base[0].length; j++) {
				base[i][j] = random.nextInt(100);
				if ( (base[i][j] % 2) == 0 ) {
					evens += base[i][j] + ", ";
					evenPos += i + "," + j + "; ";
					evenSum += base[i][j];
				} else {
					odds += base[i][j] + ", ";
					oddPos += i + "," + j + "; ";
					oddQt ++;
				}
			}
		}
		evens += "]";
		evenPos += "]";
		odds += "]";
		oddPos += "]";
		
		System.out.println(" My matrix:");
		for (int i = 0; i < base.length; i++) {
			System.out.println(Arrays.toString(base[i]));
		}
		
		System.out.println("\n Even numbers found: \n" + evens);
		System.out.println("\n Even numbers' positions: \n" + evenPos);
		System.out.println("\n Sum of all even numbers found: \n" + evenSum);
		
		System.out.println("\n Odd numbers found: \n" + odds);
		System.out.println("\n Odd numbers' positions: \n" + oddPos);
		System.out.println("\n Amount of all odd numbers found: \n" + oddQt);
	}
}
