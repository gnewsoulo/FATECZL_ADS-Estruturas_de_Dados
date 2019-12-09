import java.security.SecureRandom;
import java.util.Arrays;

/*
Algoritmo recursivo que encontra o menor elemento de um vetor de inteiros sem usar nenhum laço.
*/

public class Main {
	public static void main(String[] args) {
		SecureRandom random = new SecureRandom();
		
		int[] array = new int[random.nextInt(30) + 8];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100);
		}
		
		System.out.println(Arrays.toString(array));
		System.out.println("Smallest element: " + findSmallest(array, 0, array.length));
	}
	
	public static int findSmallest(int[] array, int ini, int end) {
		int n1;
		int n2;
		if (end - ini > 1) {
			int mid = (end + ini) / 2;
			n1 = findSmallest(array, ini, mid);
			n2 = findSmallest(array, mid, end);
		} else {
			n1 = array[ini];
			n2 = array[end-1];
		}
		return (n1 < n2) ? n1 : n2;
	}
}
