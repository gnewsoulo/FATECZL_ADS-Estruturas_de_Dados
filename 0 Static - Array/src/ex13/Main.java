package ex13;

import java.util.Arrays;
import java.util.Scanner;

/*
13. Desenvolva um algoritmo que receba 15 valores referentes às temperaturas em graus Celsius e
armazene num vetor de 15 posições. Calcule e armazene, num segundo vetor de 15 posições, os
valores de cada temperatura em graus Celsius convertidos para graus Fahrenheit. Calcule e
armazene, num terceiro vetor de 15 posições, os valores de cada temperatura em graus Celsius
convertidos para graus Kelvin. Mostre os elementos dos três vetores.
*/

public class Main {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double[] tempC = new double[15];
		double[] tempF = new double[15];
		double[] tempK = new double[15];
		
		for (int i = 0; i < tempC.length; i++) {
			System.out.println("Insert a temperature in degrees Celsius. C[" + i + "]:");
			tempC[i] = scanner.nextDouble();
			tempF[i] = CtoF(tempC[i]);
			tempK[i] = CtoK(tempC[i]);
		}
		
		System.out.println("Temperatures in degrees Celsius: " + Arrays.toString(tempC));
		System.out.println("Temperatures in degrees Fahrenheit: " + Arrays.toString(tempF));
		System.out.println("Temperatures in the Kelvin scale: " + Arrays.toString(tempK));
	}
	
	public static double CtoF(double celsius) {
		return ((celsius * 9 / 5) + 32);
	}
	
	public static double CtoK(double celsius) {
		return (celsius + 273.15);
	}
}
