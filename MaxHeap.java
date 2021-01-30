public class MaxHeap {
	int heapSize = 0;

	public static void main(String[] args) {
		int size = args.length;
		int[] arr = new int[size];
		for (int i=0; i < size; i++) {
			arr[i] = Integer.valueOf(args[i]);
		}
		MaxHeap heap = new MaxHeap(); 
		// heap.buildHeap(arr);
		int[] a = heap.heapSort(arr);
		for (int q : a) {
			System.out.println(q);
		}
	}

	public void buildHeap(int[] arr) {
		int size = arr.length;
		heapSize = arr.length;
		int internalNode = (int)Math.floor(size/2);
		for (int i = internalNode; i > 0 ; i--) {
			heapify(arr, i);
		}
		for (int a : arr) {
			System.out.println(a);
		}
	}

	public void heapify(int[] arr, int i) {
		int l = 2*i -1;
		int r = 2*i+1 -1;
		i = i-1;
		int largestValueIndex = -1;

		if(l < heapSize && arr[i] < arr[l]) {
			largestValueIndex = l;
		} else {
			largestValueIndex = i;
		}

		if (r < heapSize && arr[largestValueIndex] < arr[r]) {
			largestValueIndex = r;
		} 

		if(largestValueIndex != i) {
			System.out.printf("arr[i]%s arr[LI]%s", String.valueOf(arr[i]), String.valueOf(arr[largestValueIndex]));
			int temp = arr[i];
			arr[i] = arr[largestValueIndex];
			arr[largestValueIndex] = temp;
			heapify(arr, largestValueIndex+1);
		}
	}

	public int[] heapSort(int[] arr) {
		buildHeap(arr);
		for (int i = arr.length-1; i >0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heapSize = heapSize-1;
			heapify(arr, 1);
		}
		return arr;
	}

	// priority queue

	public int maximum(int[] arr) {
		buildHeap(arr);
		return arr[0];
	}

	public int extractMax() {
		
	}

	public void insert() {

	}
}