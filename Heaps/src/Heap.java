
public class Heap {
	
	public Heap(){}
		
	public void buildMaxHeap(int v[]) {
		for (int i = (v.length/2)-1; i >= 0; i--)
			maxHeapify(v, i, v.length);
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
