/*
1) Escreva um programa para armazenar um grafo usando uma matriz de adjacências.
*/

//Disclaimer: this program only parses square csv matrices up to 26 indexes in length;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
//		System.out.println("Insert filepath: ");
//		String filename = scanner.next();
		String filename = "Test.txt";
		
		Parser parser = new Parser(filename);
		
		parser.graph().iterate();
	}
}
