package ex16;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;

/*
16. Desenvolva um algoritmo que receba 100 valores
numéricos inteiros num vetor. Armazene os restos das
divisões dos elementos das posições pares por suas
posições, num segundo vetor, e os quocientes das
divisões dos elementos das posições ímpares por suas
posições neste segundo vetor. Mostre os elementos
dos dois vetores.
*/

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		JOptionPane.showMessageDialog(null, "! WARNING ! \n The algorithm is perfect but the instructions require the program to divide by zero. Errors are unavoidable.");
		
		int[] values = new int[100];
		double[] remainders = new double[50];
		double[] quotients = new double[50];
		
		int remCount = 0;
		int quoCount = 0;
		for (int i = 0; i < values.length; i++) {
			System.out.println("Insert an integer to the array in pos" + i + ":");
			values[i] = scanner.nextInt();
			if ( (i % 2) == 0) {
//				if (i == 0) {
//					remainders[remCount] = 0;
//					remCount ++;
//				} else {
					remainders[remCount] = values[i] % i;									
					remCount ++;
//				}
			} else {
				quotients[quoCount] = ((double) values[i]) / i;				
				quoCount ++; 
			}
		}
		scanner.close();
		System.out.println("Original array: " + Arrays.toString(values));
		System.out.println("Remainders array: " + Arrays.toString(remainders));
		System.out.println("Quotients array: " + Arrays.toString(quotients));
		
	}
}
