import java.io.*;

public class MergeSort {
	public static void main(String[] arg) throws IOException {			
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String[] stringArr = buffer.readLine().split(" ");
		int[] arr = new int[stringArr.length];
		for(int i = 0; i < stringArr.length; i++){
			arr[i] = Integer.valueOf(stringArr[i]);
		}	
		int[] sortedArr = sort(arr, 0, stringArr.length-1);
		for(int item :sortedArr) {
			System.out.println(item);
		}
	}
	
	public static int[] sort(int[] arr, int start, int end) {
		int m = (end+start)/2;
		if(end == start){
			int[] n = {arr[start]};
			return n;
		}
		int[] a1 = sort(arr, start, m);
		int[] a2 = sort(arr, m+1, end);
		return mergeArray(a1, a2);
	}

	public static int[] mergeArray(int[] a1, int[] a2) {
		int[] newArr = new int[a1.length+a2.length];
		int p =0;
		int q = 0;
		int r = 0;
		while(p < a1.length && q < a2.length) {
			if(a1[p] == a2[q]) {
				newArr[r] = a1[p];
				r++; p++;
				newArr[r] = a2[q];
				r++; q++;
				continue;
			}
			if(a1[p] > a2[q]) {
				newArr[r] = a2[q];
				q++;r++;	
				continue;
			}
			if(a1[p] < a2[q]) {
				newArr[r] = a1[p];
				r++;p++;
				continue;
			}
		
		}
		
		while(p < a1.length){
			newArr[r] = a1[p];
			p++;r++;
		}

		while(q < a2.length) {
			newArr[r] = a2[q];
			q++;r++; 
		}
		return newArr;
	}
}
