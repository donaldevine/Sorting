package sorting;

public class Sorting {
	
	public static void main(String args[]) {
		
		int insertionSortArr[] = {12, 11, 13, 5, 6};		
		InsertionSort insertionSort = new InsertionSort();		
		System.out.println("Insertion Sort: ");
		insertionSort.sort(insertionSortArr);		
		printArray(insertionSortArr);
		
        
		SelectionSort selectionSort = new SelectionSort();        
		int selectionSortArr[] = {64,25,12,22,11};		
		selectionSort.sort(selectionSortArr);
        System.out.println("Selection Sort: ");
        printArray(selectionSortArr);
        
        
        int bubbleSortArr[] = { 64, 34, 25, 12, 22, 11, 90 };        
        BubbleSort bubbleSort = new BubbleSort();        
        bubbleSort.sort(bubbleSortArr);        
        System.out.println("Bubble Sort: ");
        printArray(bubbleSortArr);
        
        
        int mergeSortArr[] = { 12, 11, 13, 5, 6, 7 };
                 
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(mergeSortArr, 0, mergeSortArr.length - 1);
 
        System.out.println("Merge Sort: ");
        printArray(mergeSortArr);
		
	}
	
	static void printArray(int arr[]) {
		
		int n = arr.length;
		
		for(int i = 0; i < n; i++) 
		{			
			
			System.out.print(arr[i] + " ");			
		}
		
		
		System.out.println();
		
	}
	
}
