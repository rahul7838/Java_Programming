import java.util.*;

public class BinarySearchString {
	public static void main(String[] args) {
		String[] s = {"rahul", "rahul", "geeks", "india", "japan"};
		Arrays.sort(s);
		int i = Arrays.binarySearch(s, "rahul");
		// int index = binarySearch(s, "rahul", 0, 4);
		System.out.println(i);
	}

	public static int binarySearch(String[] ls, String input, int start, int end) {

			while(start <= end) {

				int m = (start + end)/2;

				String temp = ls[m];

				int x = input.compareTo(temp);

				if(x == 0) {
					return m;
				}

				if(x < 0) {
					return binarySearch(ls, input, 0, m-1);
				}

				if(x > 0) {
					return binarySearch(ls, input, m+1, end);
				}
			}
			return -1;
	}
}