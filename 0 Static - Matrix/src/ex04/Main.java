package ex04;

import java.security.SecureRandom;
import java.util.Arrays;

/*
4. Desenvolva um algoritmo que receba 50 valores numéricos reais numa matriz 10x5,
calcule e armazene numa segunda matriz os 50 valores da primeira matriz
multiplicados por 7. Mostre os valores das duas matrizes.
*/

public class Main {
	public static void main(String[] args) {
		
		SecureRandom random = new SecureRandom();
		
		int[][] nums = new int[10][5];
		int[][] multiplied = new int[10][5];
		

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[0].length; j++) {
				nums[i][j] = random.nextInt(200);
				multiplied[i][j] = nums[i][j] * 7;
			}
		}
		
		System.out.println(" Original values:");
		for (int i = 0; i < nums.length; i++) {
				System.out.println(Arrays.toString(nums[i]));
		}
		
		System.out.println("\n Times 7:");
		for (int i = 0; i < multiplied.length; i++) {
				System.out.println(Arrays.toString(multiplied[i]));
		}
	}
}
