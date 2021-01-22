public class Factorial {
	public static void main(String[] ar) {
		if(ar != null) {
			System.out.println(fac(Integer.valueOf(ar[0])));

		}
	}

	public static int fac(int n) {
		if(n == 1) {
			return 1; 
		}
		return n * fac(n-1);
	}
	
}	
