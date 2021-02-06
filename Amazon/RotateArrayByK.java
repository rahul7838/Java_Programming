public class RotateArrayByK {

	public static void main(String[] args) {
		int k1 = 5;
		int[] arr = {111,122,321,445,5456,8786,7455,87414,19,10};
		int[] narr = new int[arr.length];
		int lastIndex = arr.length-1;
		int k2 = lastIndex - k1;
		narr[k2] = arr[k1];

		int j = lastIndex;
		int p = 0;

		while(true) {
			if(j > k1 && p < k2) {
				narr[p] = arr[j];
				p++;j--;
			} else {
				break;
			}
		}
		int i = k1-1;
		int q = k2+1;

		while(true) {
			if(i >=0 & q < arr.length ) {
				narr[q] = arr[i];
				i--; q++;
			} else {
				break;
			}
		}
		for (int m : narr) {
		System.out.print(m+" ");		
		}
	}
}