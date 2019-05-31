package sorting;

public class QuickSort {	
    public static void main(String args[]){ 
        int array[] = {7, 5, 8, 6, 1, 9, 3}; 
        int n = array.length; 
  
        System.out.println("Initial array"); 
        print(array); 
        
        QuickSort sorter = new QuickSort(); 
        sorter.sort(array, 0, n-1); 
  
        System.out.println("Sorted array"); 
        print(array); 
    } 
	 
    void sort(int array[], int low, int high){ 
        if (low < high){ 
            int pi = partition(array, low, high); 
  
            // Recursively sort elements before and after partition 
            sort(array, low, pi-1); 
            sort(array, pi+1, high); 
        } 
    }
    
    int partition(int array[], int low, int high){ 
        int pivot = array[high];  
        int i = (low-1);
        for (int j=low; j<high; j++){ 
            if (array[j] <= pivot){ 
                i++; 
                int temp = array[i]; 
                array[i] = array[j]; 
                array[j] = temp; 
            } 
        } 
  
        int temp = array[i+1]; 
        array[i+1] = array[high]; 
        array[high] = temp; 
  
        return i+1; 
    }
  
    static void print(int array[]){ 
        for (int i=0; i<array.length; ++i) 
            System.out.print(array[i]+" "); 
        System.out.println(); 
    } 
} 