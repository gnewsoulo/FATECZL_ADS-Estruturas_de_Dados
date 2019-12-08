public class Main
{
	public static void main(String[] args) {
	    int[] my_array = {25, 30, 35, 40, 45, 50, 55, 60};
	    
	    System.out.println(linSearch(my_array, 55));
	    int left = 0;
	    int right = my_array.length;
	    int pivot = (int) (left+right)/2; 
		System.out.println(binSearch(55, my_array, left, right, pivot));
	}
	
	public static int linSearch(int[] n, int x){
	    int len = n.length; 
	    for (int i = 0; i <  len; i++) {
	        if (n[i] == x){
	            return 1;
	        }
	    }
	    return -1;
	}
	
	public static int binSearch(int x, int[]n, int left, int right, int pivot){
	    if(n[pivot] == x){
	        return 1;
	    } else if (n[pivot] > x){
	        int new_pivot = (int) (left + pivot)/2;
	        return binSearch(x, n, left, pivot -1, new_pivot);
	    } else if (n[pivot] < x) {
	        int new_pivot = (int) (pivot + right)/2;
	        return binSearch(x, n, pivot+1, right, new_pivot);
	    }
	    return -1;
	}
}