public class ReverseHeapifyTest {

	public static void main(String[] args) {
		Heap heap = new Heap();
		int[] array = {80, 70, 50, 40, 60, 20, 10, 22, 5, 30, 35, 11, 7, 2, 1, 75};
		heap.revMaxHeapify(array);
		for(int i = 0; i < array.length; i++) { System.out.println(array[i]); }
		long start = System.nanoTime();
		heap.buildMaxHeap(array, array.length);
		long end = System.nanoTime() - start;
		System.out.println("___________________");
		System.out.println("Time: " + end);
		System.out.println("___________________");
		for(int i = 0; i < array.length; i++) { System.out.println(array[i]); }
	}

}
