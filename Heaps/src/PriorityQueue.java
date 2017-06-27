
public class PriorityQueue {
	private int[] array;
	private Heap heap;
	public PriorityQueue(int[] array) {
		this.array = array;
		heap.buildMaxHeap(array, array.length);
	}
	
	public PriorityQueue() {
		
	}
	
	public void offer(int n) {
		int[] aux = new int[array.length+1];
		for(int i = 0; i < array.length; i++) { aux[i] = array[i]; }
		aux[array.length] = n;
		heap.revMaxHeapify(aux);
		array = aux;
	}
	
	public int poll() {
		
		return 0;
	}
}
