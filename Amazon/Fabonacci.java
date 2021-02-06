public class Fabonacci {

	int[] arr;

	public static void main(String[] args) {
		// Print nth number in the Fibonacci series
		Fabonacci f = new Fabonacci();
		f.arr = new int[Integer.valueOf(args[0])+1];
		int ans = f.printN(Integer.valueOf(args[0]));
		System.out.print(ans);		
	}

	public int printN(int n) {
		if(n == 0) {
			return 0;
		}

		if(n == 1) {
			return 1;
		}

		if(arr[n] != 0) {
			return arr[n];
		}

		arr[n] = printN(n-1) + printN(n-2);

		return arr[n];
	}
}