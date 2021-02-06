public class FindAllSubsetOfString {
	
	public static void main(String[] args) {
		String ip = "abcd";
		String op = "";

		find(ip, op);

	}

	public static void find(String ip, String op) {
		if(ip.length() == 0) {
			System.out.println(op);
			return;
		}
			
		String op1 = op;
		StringBuilder sb1 = new StringBuilder(op);
		StringBuilder sb2 = new StringBuilder(ip);
		sb1.append(sb2.charAt(0));
		String op2 = sb1.toString();
		sb2.deleteCharAt(0);
		ip = sb2.toString();
		find(ip, op1);
		find(ip, op2);
	}
}