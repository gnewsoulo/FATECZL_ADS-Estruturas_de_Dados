package ex03;

import java.util.Scanner;

/*
3. Desenvolva um algoritmo que receba 50 notas bimestrais,
calcule e mostre a média aritmética destas 50 notas.
*/

public class Main {
	public static void main(String[] args) {
		
		double[] my_array = new double[50];
		double total = 0;
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < my_array.length; i++) {
			System.out.println("Insert a grade: ");
			my_array[i] = scanner.nextDouble();
			total += my_array[i];
		}
		
		System.out.println("Average of the 50 grades: " + (total/my_array.length));
	}
}
