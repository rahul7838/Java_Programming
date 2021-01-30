
import java.util.*;

public class ReverseWordInSentence {
	public static void main(String[] args) {
		String s = "hello word how are you doing";
		String[] arr = s.split(" ");
		reverse(arr);
	}

	public static void reverse(String[] arr) {

		int i = 0;
		int j = arr.length-1;
		while(i < j) {
			String temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++; 
			j--;
		}


		String p = Arrays.toString(arr);
		System.out.println(p);
		StringBuilder builder = new StringBuilder();
		for (String s :arr ) {
			builder.append(s+" ");
		}

		String s = builder.toString();
		System.out.println(s);
		
	}
}