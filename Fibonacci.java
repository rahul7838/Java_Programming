public class Fibonacci {
	public static void main(String[] arg) {
		printFibonacciSeries(Integer.valueOf(arg[0]));
	}
	
	public static void printFibonacciSeries(int number) {
		long p = 0;
		long q = 1;
		if(number < 0) {
			System.out.println(-1);
		}
		if(number == 1) {
			System.out.println(p);
		}
		if(number >= 2){
			System.out.println(p);

			System.out.println(q);
		}
		for(int i = 0; i< number-2;i++){
			long lastNumber =(long)p+(long)q;
			p = q;
			q = lastNumber;
			 
			System.out.println(lastNumber);
		}
		
	}
}
