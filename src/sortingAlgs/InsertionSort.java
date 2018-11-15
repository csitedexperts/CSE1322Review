package sortingAlgs;


/*Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
Java  // https://www.geeksforgeeks.org/java-program-for-bubble-sort/
// https://www.javatpoint.com/bubble-sort-in-java
 */
// Java program for implementation of Bubble Sort
public class InsertionSort
{
	public static void insertionSort(int arr[])
	{
		int n = arr.length; 
        for (int i=1; i<n; ++i) 
        { 
            int key = arr[i]; 
            int j = i-1; 
  
            /* Move elements of arr[0..i-1], that are 
               greater than key, to one position ahead 
               of their current position */
            while (j>=0 && arr[j] > key) 
            { 
                arr[j+1] = arr[j]; 
                j = j-1; 
            } 
            arr[j+1] = key; 
        } 
        
	}


	// Driver method to test above
	public static void main(String args[])
	{
		int arr[] = {64, 34, 25, 12, 22, 11, 90};

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