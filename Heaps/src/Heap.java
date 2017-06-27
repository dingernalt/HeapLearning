
public class Heap {
	
	public Heap(){}
		
	public void buildMaxHeap(int v[], int length) {
		for (int i = (length/2)-1; i >= 0; i--)
			maxHeapify(v, i, length);
		}
	
	public void maxHeapify(int v[]) {
		maxHeapify(v, 0, v.length);
	}
	
	public void revMaxHeapify(int v[]) {
		revMaxHeapify(v, v.length-1, v.length);
	}
	
	private void revMaxHeapify(int v[], int i, int size) {
		int aux;
		int largest;
		int p = (i-1)/2;
		if(v[p] > v[i])
			largest = p;
		else
			largest = i;
		if (largest != i) {
			aux = v[i];
			v[i] = v[largest];
			v[largest] = aux;		
			maxHeapify(v, largest, size);
		}
	}
	
	private void maxHeapify(int v [], int i, int size) {
		int aux;
		int largest;
		int l = (2*i)+1; // indice do filho da esquerda
		int r = l + 1; // indice do filho da direita
		if ((l < size) && (v[l] > v[i]))
			largest = l;
		else
			largest = i;
		if ((r < size) && (v[r] > v[largest]))
			largest = r;
		if (largest != i) {
			aux = v[i];
			v[i] = v[largest];
			v[largest] = aux;		
			maxHeapify(v, largest, size);
		}
	}
	
	
}
