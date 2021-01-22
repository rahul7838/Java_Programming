public class Stack {
	Node head;
	int size = 0;
	class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}

	public int push(int value) {
		size++;
		if(head == null) {
			head = new Node(value);
			return value;
		}
		Node newNode = new Node(value);
		Node temp = head;
		head = newNode;
		head.next = temp;
		return value;
	}

	public int pop() {
		if(head == null){
			return -1;
		}
		size--;
		Node temp = head;
		head = temp.next;
		temp = null;
		return head.value;
	}

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		Node temp = s.head;
		for (int i=0; i < s.size; i++) {
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
}