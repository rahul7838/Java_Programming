public class CountFreq {
	public static void main(String[] args) {
		int[] arr = new int[args.length];
		for(int i = 0; i< args.length; i++) {
			arr[i] = Integer.valueOf(args[i]);
		}
		count(arr);
	}

	public static void count(int[] arr) {
		int i = 0;
		while(i < arr.length) {
			if(arr[i] <= 0) {
				i++;
			} else {
				int a = arr[i];
			    int b = arr[a-1];
			 	
				if(arr[a-1] <= 0) {
					arr[i] = 0;
					arr[a-1] = arr[a-1] -1;
					i++;
				} else {
					
						arr[i] = b;
						arr[a-1] = -1;
					
				}			
			}
		}
		for (int w = 0; w < arr.length; w++) {
			System.out.printf("%s->%s%n", w+1, Math.abs(arr[w]));
		}
	}
}