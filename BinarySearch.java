import java.io.*;

public class BinarySearch {
	public static void main(String[] arg) throws IOException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.valueOf(buffer.readLine());
		String[] stringArr = buffer.readLine().split(" ");
		int[] arr = new int[stringArr.length];
		for(String s : stringArr) {
			arr[0] = Integer.valueOf(s);
		}
		int index = search(number, arr, 0, arr.length-1);
		System.out.println(index);
	}
	public static int search(int number, int[] arr, int start, int end) {
		
		if(start >  end) {
			return -1;
		}
		
		int m = (end + start)/2;
		System.out.println(m);

		System.out.println(number);
		if(arr[m] == number) {
			return m;
		}
		if(arr[m] > number) {
			System.out.println("start"+String.valueOf(start) + "end"+ String.valueOf(m-1));
			search(number, arr, start, m-1);
		}
		if(arr[m] < number) {

			System.out.println("start"+String.valueOf(m+1) + "end"+ String.valueOf(end));
			search(number, arr, m+1, end);
		}
		return -1;
	}
}
