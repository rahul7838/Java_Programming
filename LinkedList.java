public class LinkedList {

	class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}                          

	Node head;
	int size;

	public void add(int value) {
		size++;
		if(head == null) {
			Node n = new Node(value);
			head = n;
		} else {
			Node n = new Node(value);
			Node temp = head;
			head = n;
			head.next = temp;
		}
	}                       

	public int remove() {
		if(head == null) {
			return -1;
		}
		int ans = head.value;
		Node temp = head.next;
		head = temp;
		return ans;
	} 

	public boolean empty() {
		return size == 0;
	}                                                                                                                                                                       

	public static void main(String[] args) {
		LinkedList ls = new LinkedList();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(12);
		System.out.println(ls.remove());
		System.out.println(ls.remove());
		System.out.println(ls.remove());
		System.out.println(ls.remove());

	}
}