package linear_sum;

public class Main
{
	public static void main(String[] args) {
	    int[] my_array = {10, 20, 30, 40, 50};
	    System.out.println(linSum(my_array, my_array.length));
	}
	
    public static int linSum(int[] n, int len){
        if (len == 1) return n[0];
        return n[len-1] + linSum(n, (len-1));
    }
}
