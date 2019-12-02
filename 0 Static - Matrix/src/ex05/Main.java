package ex05;

import java.util.Arrays;

/*
5. Desenvolva um algoritmo que calcule a tabuada dos números de 1 a 10 e
armazene numa matriz de dimensões 10x10 o resultado da tabuada. Mostre os
elementos da matriz. Na primeira coluna da matriz, armazene a tabuada da número
1, na segunda coluna da matriz, armazene a tabuada do número 2 e assim por diante,
até a última coluna da matriz, armazene a tabuada do número 10.
*/

public class Main {
	public static void main(String[] args) {
		
		int[][] multTable = new int[10][10];
		
		for (int i = 1; i <= multTable.length; i++) {
			for (int j = 1; j <= multTable[0].length; j++) {
				multTable[j-1][i-1] = i * j;
			}
		}
		
		System.out.println(" Multiplication tables:");
		for (int i = 0; i < multTable.length; i++) {
				System.out.println(Arrays.toString(multTable[i]));
		}
	}
}
