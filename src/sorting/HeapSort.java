package sorting;

public class HeapSort {
    public static void main(String args[]){
        int array[] = {14, 6, 5, 9, 12, 3}; 
  
        System.out.print("Initial Array: ");
        print(array);
     
        HeapSort sorter = new HeapSort(); 
        sorter.sort(array); 
        
        System.out.print("Sorted Array:  ");
        print(array);
    } 
	
    public void sort(int array[]){
        int n = array.length; 
  
        // Build heap
        for (int i = n / 2 - 1; i >= 0; i--) 
            heapify(array, n, i); 
  
        //extract element from heap 
        for (int i=n-1; i>=0; i--){
            int temp = array[0]; 
            array[0] = array[i]; 
            array[i] = temp; 
  
            // call max heapify on the reduced heap 
            heapify(array, i, 0); 
        } 
    } 
  
    void heapify(int array[], int n, int i){
        int largest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;
  
        if (l < n && array[l] > array[largest]) 
            largest = l; 
  
        if (r < n && array[r] > array[largest]) 
            largest = r; 
  
        if (largest != i){
            int swap = array[i]; 
            array[i] = array[largest]; 
            array[largest] = swap; 
  
            // Recursively heapify the affected sub-tree 
            heapify(array, n, largest); 
        } 
    } 
  
    // A utility function to print array of size n //
    static void print(int array[]){
        for (int i=0; i<array.length; ++i) 
            System.out.print(array[i]+" "); 
        System.out.println(); 
    } 
} 