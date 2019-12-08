package series01;

public class Main
{
	public static void main(String[] args) {
		System.out.println(rec(3));
		System.out.println(rec(3));
	}
	
	public static int rec(int n) {
	    if (n > 1) {
	        return (n + rec(n-1));
	    } else {
	        return n;
	    }
	}
	
	public static int rec2(int n){
	    return n == 1 ? 1 : n + rec2(n-1);
	}
}