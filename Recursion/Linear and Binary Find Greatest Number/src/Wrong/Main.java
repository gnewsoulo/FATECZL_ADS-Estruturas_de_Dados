package Wrong;

public class Main {
	public static void main(String[] args) {
		
		int[] my_array = {58, 45, 20, 18, 35, 75, 28, 9};
		int g1 = findGreatest(my_array);
		int g2 = findGreatest(my_array, 0, my_array.length);
		
		System.out.println(g1);
		System.out.println(g2);
	}
	
	public static int findGreatest(int[] my_array) {
		int greatest = my_array[0];
		for (int i = 0; i < my_array.length; i++) {
			if (my_array[i] > greatest) {
				greatest = my_array[i];
			}
		}
		return greatest;
	}
	
	public static int findGreatest(int[] my_array, int ini, int end) {
		int mid = (ini + end) /2;
		int n1;
		int n2;
		if (my_array[mid] > my_array[ini]) {
			n1 = findGreatest(my_array, ini, mid);
			n2 = findGreatest(my_array, mid+1, end);
		} else {
			n1 = my_array[ini];
			n2 = my_array[end-1];
		}
		return (n1 > n2) ? n1 : n2;
	}
}
