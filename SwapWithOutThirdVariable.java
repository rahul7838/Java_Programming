public class SwapWithOutThirdVariable {
	
	public static void main(String[] args) {
		int a = Integer.valueOf(args[0]);
		int b = Integer.valueOf(args[1]);

		 a = a+b;
		 b = a - b;
		 a = a-b;

		System.out.printf("a:%s,b:%s", a, b);
	}
}
