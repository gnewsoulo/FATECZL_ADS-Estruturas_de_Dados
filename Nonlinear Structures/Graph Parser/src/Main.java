/*
This program only works for unweighted graphs;
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
//		System.out.println("Insert filepath: ");
//		String filename = scanner.next();
		String filename = "Test.txt";
		
		
		String dump = firstParse(filename);

		if (testSquare(dump)) {
		} else {
			System.out.println("Your matrix needs to be square to be parsed into a graph!");
		}
	}
	
	public static String firstParse(String filename) throws IOException {
		String dump = "";
		BufferedReader br = new BufferedReader(new FileReader(filename));
		
		String line = br.readLine();
		
		while (line != null) {
			String[] tempLine = line.split(",");
			for (int i = 0; i < tempLine.length; i++) {
				dump += tempLine[i];
			}
			line = br.readLine();
		}
		return(dump);
	}
	
	public static boolean testSquare(String dump) {
		double squaredLength = Math.sqrt(dump.length());
		return (squaredLength == Math.floor(squaredLength));
	}
}
