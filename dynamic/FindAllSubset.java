import java.util.*;

public class FindAllSubset {
	
	public static void main(String[] args) {
		int[] ip = {10, 20};
		int[] op = new int[2];
		int ci = 0;

		find(ip, op, ci);

	}

	public static void find(int[] ip, int[] op, int ci) {
		if(ip.length == ci) {
			for(int i = 0; i<op.length; ++i) {
				if(op[i] != 0) {
				  System.out.print(op[i]+ " ");					
				}
			}
			System.out.println();
			return;
		}

		int[] op1 = Arrays.copyOf(op, op.length);
		int[] op2 = Arrays.copyOf(op, op.length);
		op2[ci] = ip[ci];
		ci++;
		find(ip, op1, ci);
		find(ip, op2, ci);
	}
}