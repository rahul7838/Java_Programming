public class DynamicFibonacci {
	public static void main(String[] args) {
		int d = Integer.valueOf(args[0]);
		int[] arr = new int[d+1];
		for(int i = 0; i < d+1; i++) {
			arr[i] = -1;
		}
		System.out.println(fib(d, arr));
	}	

	public static int fib(int d,int[]  arr) {
		if(d == 1) {
			arr[d] = 1;
			return 1;
		}
		if(d == 0) {
			arr[d] = 0;
			return 0;
		}
		if(arr[d] >= 0) {
			return arr[d];
		}
		arr[d] = fib(d-1, arr)+fib(d-2, arr);
		return arr[d];
	}
}
