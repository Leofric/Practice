package sorting;

/* Bubble Sort implementation
 * Worst case run time: O(n*n) //reverse sorted
 * Best case run time:  O(n)   //already sorted
 * Auxillary space O(1)		   //placeholder variable
 * Sort in place? yes
 * Stable? yes
 */

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] array = {4, 2, 1, 3, 5, 8, 1};
		int temp = 0;
		boolean sorted = false;
		
		//print initial array
		System.out.print("Unsorted array: [");
		for(int i = 0; i<array.length; i++){
			if(i == array.length-1){
				System.out.print(array[i]+"]");
			}
			else{
				System.out.print(array[i]+", ");
			}
		}
		
		while(!sorted){
			sorted = true;
			for(int i=0; i<array.length-1; i++){
				if(array[i] > array[i+1]){
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
					sorted = false;
				}
			}
		}
		
		//print sorted array
		System.out.print("\nSorted array:   [");
		for(int i = 0; i<array.length; i++){
			if(i == array.length-1){
				System.out.print(array[i]+"]");
			}
			else{
				System.out.print(array[i]+", ");
			}
		}
		
	}

}
