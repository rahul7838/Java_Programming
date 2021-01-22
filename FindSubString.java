public class FindSubString {

	public static void main(String[] args) {
		String s1 = args[0];
		String s2 = args[1];
		int s = s2.length();
		boolean flag = true;
		int ans = 0;
		for (int i = 0; i < s1.length()-2; i++) {
			String s3 = s1.substring(i, i+s);
			if(s3.equals(s2)) {
				flag = false;
				ans = i;
				break;
			}
		}
		if(flag) {
			System.out.println(-1);
		} else {
			System.out.println(ans);
		}
	}
}