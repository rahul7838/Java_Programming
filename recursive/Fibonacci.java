public class Fibonacci {
	public static void main(String[] ar) {
		System.out.println(fibo(Integer.valueOf(ar[0])));
	}
	public static int fibo(int d) {
		if(d == 1) {
			return 1;
		}
		if(d == 0) {
			return 0;
		}
		return fibo(d-1)+fibo(d-2);
	}
}
