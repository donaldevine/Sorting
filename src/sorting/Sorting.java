package sorting;

public class Sorting {
	
	public static void main(String args[]) {
		
		int insertionSortArr[] = {12, 11, 13, 5, 6};
		
		System.out.println("Before Insertion Sort: ");
		printArray(insertionSortArr);
		
		InsertionSort insertionSort = new InsertionSort();
		insertionSort.sort(insertionSortArr);		
		
		System.out.println("After Insertion Sort: ");
		printArray(insertionSortArr);
		
        
		int selectionSortArr[] = {64,25,12,22,11};
		
		System.out.println("Before Selection Sort: ");
        printArray(selectionSortArr);
		
		SelectionSort selectionSort = new SelectionSort();
						
		selectionSort.sort(selectionSortArr);
		
        System.out.println("After Selection Sort: ");
        printArray(selectionSortArr);
        
        
        int bubbleSortArr[] = { 64, 34, 25, 12, 22, 11, 90 };
        
        System.out.println("Before Bubble Sort: ");
        printArray(bubbleSortArr);
        
        BubbleSort bubbleSort = new BubbleSort();        
        bubbleSort.sort(bubbleSortArr);        
        
        System.out.println("After Bubble Sort: ");
        printArray(bubbleSortArr);
        
        
        int mergeSortArr[] = { 12, 11, 13, 5, 6, 7 };
        
        System.out.println("Before Merge Sort: ");
        printArray(mergeSortArr);
                 
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(mergeSortArr, 0, mergeSortArr.length - 1);
 
        System.out.println("After Merge Sort: ");
        printArray(mergeSortArr);
        
        
        int[] quickSortArray = { 10, 7, 8, 9, 1, 5 };
        
        System.out.println("Before Quick Sort: ");
        printArray(quickSortArray);
        
        int N = quickSortArray.length;
        
        QuickSort quickSort = new QuickSort();
        
        quickSort.sort(quickSortArray, 0, N - 1);
                
        System.out.println("After Quick Sort: ");
        printArray(quickSortArray);
		
	}
	
	static void printArray(int arr[]) {
		
		int n = arr.length;
		
		for(int i = 0; i < n; i++) 
		{			
			
			System.out.print(arr[i] + " ");			
		}
		
		
		System.out.println();
		System.out.println();
		
	}
	
}
