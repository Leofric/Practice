package sorting;

public class MergeSort {
    public static void main(String args[]){
        int array[] = {5, 7, 4, 2, 6, 9}; 
  
        System.out.println("Initial Array"); 
        printArray(array); 
  
        MergeSort sorter = new MergeSort(); 
        sorter.sort(array, 0, array.length-1); 
  
        System.out.println("\nSorted array"); 
        printArray(array); 
    }
	
    void merge(int array[], int l, int m, int r){ 
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        //Create temp arrays
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        //Copy data to temp arrays
        for (int i=0; i<n1; ++i) 
            L[i] = array[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = array[m + 1+ j]; 
  
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2){ 
            if (L[i] <= R[j]){ 
                array[k] = L[i]; 
                i++; 
            } 
            else{
                array[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        // Copy remaining elements of L[] if any
        while (i < n1){
            array[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        //Copy remaining elements of R[] if any
        while (j < n2){ 
            array[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
  
    void sort(int arr[], int l, int r){ 
        if (l < r){
            // Find mid point 
            int m = (l+r)/2; 
  
            // Sort first and second halves 
            sort(arr, l, m); 
            sort(arr , m+1, r); 
  
            // Merge the sorted halves 
            merge(arr, l, m, r); 
        } 
    } 
  
    static void printArray(int array[]){
        for (int i=0; i<array.length; ++i) 
            System.out.print(array[i] + " "); 
        System.out.println(); 
    }  
} 