import java.util.LinkedList;

public class MergeSortedArray {

	public static void main(String[] args) {
		LinkedList<Integer> a1 = new LinkedList<Integer>();
		LinkedList<Integer> a2 = new LinkedList<Integer>();

		a1.add(1);
		a1.add(3);
		a1.add(7);
		a2.add(5);
		a2.add(10);
		a2.add(12);

		LinkedList a3 = new LinkedList();
		int i = 0;
		int j = 0;
		while(i < a1.size() && j < a2.size()) {

			if(a1.get(i) > a2.get(j)) {
				a3.add(a2.get(j));
				j++;
				continue;
			}

			if(a1.get(i) < a2.get(j)) {
				a3.add(a1.get(i));
				i++;
				continue;
			}	

			if(a1.get(i) == a2.get(j)) {
				a3.add(a2.get(j));
				a3.add(a1.get(i));
				j++;i++;
			}
		}

		while(i < a1.size())  {
			// System.out.println(a1.peek());
			a3.add(a1.get(i));
			i++;
		}

		while(j < a2.size())  {
			// System.out.println(a2.peek());
			a3.add(a2.get(j));
			j++;
		}

		for (int q = 0; q < a3.size(); q++) {
			System.out.println(a3.get(q));
		}

	}
}