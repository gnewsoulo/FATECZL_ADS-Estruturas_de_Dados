package ex15;

import java.util.Arrays;
import java.util.Scanner;

/*
15. Desenvolva um algoritmo que receba 35 valores numéricos reais num vetor e
classifique em ordem crescente os elementos desse vetor, utilizando a seguinte regra:

- selecione o menor elemento do vetor de 35 posições;

- troque este elemento pelo primeiro elemento do vetor;

- repita os dois primeiros itens, considerando agora os 34 elementos restantes do vetor,
trocando o menor elemento com o segundo elemento do vetor;

- repita os dois primeiros itens, considerando agora os 33 elementos restantes do vetor,
trocando o menor elemento com o terceiro elemento do vetor;

- continue até que se considere apenas o vetor com a última posição.

Mostre os elementos ordenados do vetor.
*/

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double[] nums = new double[10];
		int minPos = 0;
		
		for (int i = 0; i < nums.length; i++) {
			System.out.println("Insert a value to the array, pos" + i);
			nums[i] = scanner.nextDouble();
		}
		
		System.out.println(Arrays.toString(nums));
		
		for (int i = 0; i < nums.length; i++) {
			minPos = findMin(nums, i);
			if (minPos != i) {
				double aux = nums[minPos];
				nums[minPos] = nums[i];
				nums[i] = aux;
			}
		}
		
		System.out.println(Arrays.toString(nums));
	}
	
	public static int findMin(double[] nums, int pos) {
		int posControl = pos;
		int minPos = 0;
		for (int i = pos; i < nums.length; i++) {
			if(i == posControl) {
				minPos = i;
			} else if (nums[i] < nums[minPos]) {
				minPos = i;
			}
		}
		
		return minPos;
	}
}
