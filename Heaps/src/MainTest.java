import java.util.Random;

public class MainTest {

	public static void main(String[] args) {
		Heap heap = new Heap();
		Random rand = new Random(13081994);

		int[] array = new int[5000];
		for(int i = 0; i < array.length; i++) { array[i] = rand.nextInt(5000); }
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
