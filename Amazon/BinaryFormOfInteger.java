public class BinaryFormOfInteger {
	public static void main(String[] args) {
		int value = 959682455;
		int[] d = new int[30];
		int l = 0;
		while(value > 0) {
			d[l] = value % 2;
			value /= 2;
			l++; 
			System.out.println(value);
		}

		for(int n:d) {
			
		}
	}
}