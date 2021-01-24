public class Queue {

	class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}

	Node head;
	Node tail;
	int size;

	public int enqueue(int value) {
		size++;
		if (head == null) {
			Node n = new Node(value);
			head = n;	
			tail = n;
		} else {
			Node newNode = new Node(value);
			Node temp = tail;
			tail = newNode;
			temp.next = tail;
			return value;
		}
		return value;
	}

	public int dequeue() {
		if(head == null) {
			return -1;
		}
		size--;
		int ans = head.value;
		Node nextNode = head.next;
		head = nextNode;
		return ans;
	}

	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.dequeue();
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
	}
}