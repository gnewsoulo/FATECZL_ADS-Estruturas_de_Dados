import java.security.SecureRandom;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		SecureRandom random = new SecureRandom();
		
		int[] array = new int[10];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(50);
		}
		
		System.out.println(Arrays.toString(array));
		quickSort(array, 0, array.length -1);
		System.out.println(Arrays.toString(array));
	}
	
	public static void quickSort(int[] array, int ini, int end) {
		if (ini < end) {
			int pivot = partition(array, ini, end);
			quickSort(array, ini, pivot-1);
			quickSort(array, pivot+1, end);
		}
	}
	
	public static int partition(int[] array, int ini, int end) {
		int pivot = array[end];
		int i = ini;
		
		for (int j = ini; j < end; j++) {
			if (array[j] <= pivot) {
				int aux = array[i];
				array[i] = array[j];
				array[j] = aux;
				i++;
			}
		}
		
		int aux = array[i];
		array[i] = array[end];
		array[end] = aux;
		
		return i;
	}
}
