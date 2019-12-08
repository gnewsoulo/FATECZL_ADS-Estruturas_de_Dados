package ex01;

import java.util.Arrays;

import resources.Alphanumerics;

/*
1. Desenvolva um algoritmo que receba e mostre 120 valores
alfanuméricos numa matriz 10x12.
*/

public class Main {
	public static void main(String[] args) {
		Alphanumerics alpha = new Alphanumerics();
		
		String[][] matrix = new String[10][12];
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = alpha.getAlpha();
			}
		}
		
		System.out.println("My matrix:");
		for (int i = 0; i < matrix.length; i++) {
				System.out.println(Arrays.toString(matrix[i]));
		}
	}
}
