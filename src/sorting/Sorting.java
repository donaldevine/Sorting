package sorting;

public class Sorting {
	
	public static void main(String args[]) {
		
		int insertionSortArr[] = {12, 11, 13, 5, 6};
		
		InsertionSort insertionSort = new InsertionSort();
		
		System.out.println("Insertion Sort");
		insertionSort.sort(insertionSortArr);
		
		printArray(insertionSortArr);
		
        
		SelectionSort selectionSort = new SelectionSort();
        
		int selectionSortArr[] = {64,25,12,22,11};
		
		selectionSort.sort(selectionSortArr);
        System.out.println("Selection array");
        printArray(selectionSortArr);
		
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
