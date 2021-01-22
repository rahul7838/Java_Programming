public class EvenIndexOddIndex {
	public static void main(String[] arg) {
		int[] ar = new int[arg.length];
		for(int i = 0; i < arg.length; i++) {
			ar[i] = Integer.valueOf(arg[i]);
		}
		evenOdd(ar);
	}	

	public static void evenOdd(int[] arr) {
		int evenI = 0;
		int oddI = 1;
		
		int length = arr.length;
		while(true) {
			
			while(evenI < length && arr[evenI]%2 ==0) {
				evenI = evenI+2;
			}

			while(oddI < length && arr[oddI]%2 == 1) {
				oddI = oddI+2;
			}
	
			if(evenI<length && oddI < length) {
				int temp = arr[oddI];
				arr[oddI] = arr[evenI];
				arr[evenI] = temp;
			} else {
				break;
			}
		}
		for(int q: arr){
			System.out.println(q);
		}
	}
}
