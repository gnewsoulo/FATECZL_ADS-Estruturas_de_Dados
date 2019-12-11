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
		System.out.println(Arrays.toString(selectionSort(array)));
	}
	
	public static int[] selectionSort(int[] array) {
		for(int i = 0; i < array.length; i++) {
			int j = i;
			int key = findSmallest(array, i, array.length);
			while (array[j] != key) {
				j++;
			}
			if (array[i] > array[j]) {
				array[j] = array[i];
				array[i] = key;
			}
		}
		return array;
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
		return n1 < n2 ? n1 : n2;
	}
}
