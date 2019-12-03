package ex08;

import java.security.SecureRandom;
import java.util.Arrays;
import resources.Alphanumerics;

/*
8. Desenvolva um algoritmo que receba 75 valores alfanuméricos
numa matriz de dimensões 15x5, armazene estes valores numa
segunda matriz de dimensões 15x5 a partir do centro para a primeira
e a última posições e de modo alternado, ou seja, o primeiro elemento
da primeira matriz estará na posição do meio da segunda matriz, o
segundo elemento da primeira matriz estará na posição à esquerda da
posição do meio da segunda matriz, o terceiro elemento da primeira
matriz estará na posição à direita da posição do meio da segunda
matriz e assim por diante. Mostre os elementos das duas matrizes.
*/

/*
Essas instruções não estão claras... O que é "a posição do meio da segunda matriz?"
Isso faz sentido num vetor, que é unidimensional, mas uma matriz não tem "uma posição do meio" necessariamente.
Mesmo que tenha, considerando a posição [i/2][j/2], as instruções não ditam como trabalhar com a segunda dimensão...
Impossível de se realizar o algoritmo seguindo às instruções dadas.
*/

public class Main {
	public static void main(String[] args) {
		
		Alphanumerics alpha = new Alphanumerics();
		SecureRandom random = new SecureRandom();
		
		int[][] original = new int[15][5];
		int[][] alternate = new int[15][5];
		
		for (int i = 0; i < original.length; i++) {
			for (int j = 0; j < original[0].length; j++) {
				original[i][j] = random.nextInt(90) + 10;
			}
		}
		
		System.out.println(" Original matrix:");
		for (int i = 0; i < original.length; i++) {
			System.out.println(Arrays.toString(original[i]));			
		}
		
		System.out.println("\n Alternate matrix:");
		for (int i = 0; i < alternate.length; i++) {
			System.out.println(Arrays.toString(alternate[i]));			
		}
	}
}
