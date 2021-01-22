public class RmAlternateChar {
	
	public static void main(String[] args) {
		String a = args[0];
		char[] arr = a.toCharArray();
		StringBuilder builder = new StringBuilder();
		int i = 0;
		while(i < arr.length) {
			builder.append(arr[i]);
			i = i+2;
		}
		String g = builder.toString();
		System.out.println(g);
	}


}