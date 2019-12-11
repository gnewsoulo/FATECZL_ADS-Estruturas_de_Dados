import java.security.SecureRandom;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		SecureRandom random = new SecureRandom();
		int[] array = new int[12];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(30);
		}
		
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(bubbleSort(array)));
	}
	
	public static int[] bubbleSort(int[] array) {
		int length = array.length;
		for (int i = 0; i < length-1; i++) {
			for (int j = i+1; j < length; j++) {
				if (array[i] > array[j]) {
					int aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
		}
		return array;
	}
}
