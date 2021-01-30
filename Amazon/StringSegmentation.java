import java.util.*;

public class StringSegmentation {
	public static void main(String[] args) {
		// Given a dictionary of words.
		// apple
		// pear
		// pie
		// Input string of “applepie” can be segmented into dictionary words.
		String[] ls = {"apple", "pear", "pie"};
		String input = "applepieapplepiepearIndiajapanapple";
		segmentWord(ls, input);
	}

	public static void segmentWord(String[] ls, String input) {
		Arrays.sort(ls);
		boolean flag = true;
		int p = 0;
		for (int i=1; i<input.length(); i++) {
			String first = input.substring(p, i);
			String sec = input.substring(i, input.length());
			if(Arrays.binarySearch(ls, first) >= 0) {
				 p = i;
				 System.out.println(first);
			}
			if (Arrays.binarySearch(ls, sec) >= 0) {
				System.out.println(sec);
			}

			if(Arrays.binarySearch(ls, first) > 0 && Arrays.binarySearch(ls, sec) > 0) {
				break;
			}
		}
	}
}