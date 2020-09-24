package sortingAlgs;
/*
Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands.
Algorithm  // https://www.geeksforgeeks.org/insertion-sort/

// Sort an arr[] of size n
insertionSort(arr, n)
Loop from i = 1 to n-1.
��a) Pick element arr[i] and insert it into sorted sequence arr[0�i-1]

*/
// Java program for implementation of Insertion Sort
public class InsertionSort{
	public static void insertionSort(int a[]){
		int swapsNeeded = 0;
        for (int i=1; i< a.length; ++i){ 
            int key = a[i]; 
            int position = i; 
  
            /* Move elements of a[0..i-1], that are greater than key, 
             * to one position ahead of their current position */
            while (position > 0 && a[position -1] > key){ 
                a[position] = a[position-1]; 
                position--;
                swapsNeeded++;
            } 
            a[position] = key; 
        } 
    	System.out.println("Swaps Needed: " + swapsNeeded);  
	}


	// Driver method to test above
	public static void main(String args[])
	{
		
		int arr[] = {8, 4, 2, 1};
//		int arr[] = {64, 14, 34, 25, 12, 22, 11, 90, 1};

		System.out.println("Unsorted array");
		/* Prints the array */
		for (int i=0; i<arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
		
		insertionSort(arr);
		System.out.println("Sorted array");
		/* Prints the array */

		for (int i=0; i<arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
	}

}