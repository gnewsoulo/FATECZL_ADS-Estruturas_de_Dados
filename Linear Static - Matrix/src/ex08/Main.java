package ex08;

import java.security.SecureRandom;
import java.util.Arrays;
import resources.Alphanumerics;

/*
8. Desenvolva um algoritmo que receba 75 valores alfanum�ricos
numa matriz de dimens�es 15x5, armazene estes valores numa
segunda matriz de dimens�es 15x5 a partir do centro para a primeira
e a �ltima posi��es e de modo alternado, ou seja, o primeiro elemento
da primeira matriz estar� na posi��o do meio da segunda matriz, o
segundo elemento da primeira matriz estar� na posi��o � esquerda da
posi��o do meio da segunda matriz, o terceiro elemento da primeira
matriz estar� na posi��o � direita da posi��o do meio da segunda
matriz e assim por diante. Mostre os elementos das duas matrizes.
*/

/*
Essas instru��es n�o est�o claras... O que � "a posi��o do meio da segunda matriz?"
Isso faz sentido num vetor, que � unidimensional, mas uma matriz n�o tem "uma posi��o do meio" necessariamente.
Mesmo que tenha, considerando a posi��o [i/2][j/2], as instru��es n�o ditam como trabalhar com a segunda dimens�o...
Imposs�vel de se realizar o algoritmo seguindo �s instru��es dadas.
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
