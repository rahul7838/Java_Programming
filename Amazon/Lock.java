import java.util.*;

public class Lock {

	public static void main(String[] args) {
		String startState = "123";
		String endState = "513";
		String[] deadLock = {"113", "213", "413", "423"};
		int ans = find(startState, endState, deadLock);
		System.out.println(ans);
	}

	public static int find(String startState, String endState, String[] deadLock) {
		char[] s = startState.toCharArray();
		char[] e = endState.toCharArray();
		int i = 0;
		int ans = 0;
		while(i < s.length) {

			if(s[i] < e[i]) {
				s[i] = (char) (s[i] + 1);
				ans++;
				String temp = String.valueOf(s);
				if(Arrays.binarySearch(deadLock, temp) >= 0) {	
					return -1;
				}
				continue;
			}

			if(s[i] > e[i]) {
				s[i] = (char)(s[i] - 1);
				ans++;
				String temp = String.valueOf(s);
				if(Arrays.binarySearch(deadLock, temp) >= 0) {	
					return -1;
				}
				continue;
			}

			if(s[i] == e[i]) {
				i++;
			}
		}
		return ans;
	}
}