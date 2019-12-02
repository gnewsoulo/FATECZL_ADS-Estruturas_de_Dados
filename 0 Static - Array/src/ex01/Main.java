package ex01;

import java.util.Scanner;

/* 
1. Desenvolva um algoritmo que receba 25
valores inteiros e mostre esses números. 
*/  

public class Main {
	public static void main (String[] args) {
		
		int[] my_array = new int[25];
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < my_array.length; i++) {
			try {
				System.out.println("Insert an integer: ");
				my_array[i] = scanner.nextInt();
			} catch (Exception e) {
				System.out.println("I said an integer, dammit!");
			} finally {
				System.out.println("my_array[" + i + "] = " + my_array[i] + "\n");
			}
		}
	}
}
