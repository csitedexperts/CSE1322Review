package sortingAlgs;


/*Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
Java  // https://www.geeksforgeeks.org/java-program-for-bubble-sort/
// https://www.javatpoint.com/bubble-sort-in-java
 */
// Java program for implementation of Bubble Sort
public class BubbleSort{

	public static void bubbleSort(int a[])	{

		int swapsNeeded = 0;
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1 - i ; j++)
				if (a[j+1] < a[j])  // Makes Ascending order
				{
					// swap temp and a[i]
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					swapsNeeded++;
				}
		}

		System.out.println("Swaps Needed: " + swapsNeeded);
	}




	// Driver method to test above
	public static void main(String args[])
	{
		int arr[] = {8, 9, 3, 1, 4, 2, 7};
		//int arr[] = {64, 34, 14, 25, 12, 22, 11, 90, 1};

		System.out.println("Unsorted array");
		/* Prints the array */
		for (int i=0; i<arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();


		bubbleSort(arr);
		System.out.println("Sorted array");
		/* Prints the array */

		for (int i=0; i<arr.length; ++i) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();
	}

}