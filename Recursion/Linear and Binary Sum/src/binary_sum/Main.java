package binary_sum;

public class Main
{
	public static void main(String[] args) {
	    int[] my_array = {10, 20, 30, 40, 50};
	    System.out.println(linSum(my_array, my_array.length));
	    System.out.println(binSum(my_array, 0, my_array.length));
	}
	
    public static int linSum(int[] n, int len){
        if (len == 1) return n[0];
        return n[len-1] + linSum(n, (len-1));
    }
    
    public static int binSum(int[] n, int ini, int end){
        if (end - ini == 1) return n[ini];
        int floor = (int) (end+ini)/2;
        int ceil = floor + 1;
        return binSum(n, ini, ceil) + binSum(n, ini + ceil, end);
    }
}