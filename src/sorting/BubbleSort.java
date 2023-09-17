package sorting;

public class BubbleSort {
	
	void sort(int arr[]) {
		int n = arr.length;
		
		int i, j, temp;
		
		boolean swapped;
		
		for(i = 0; i < n-1; i++) 
		{
			swapped = false;
			
			for(j = 0; j < n - i -1; j++) 
			{				
				//swap if one on the left is greater
				if(arr[j] > arr [j + 1]) 
				{
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;															
				}
			}
			
			//No swaps in a round, then they must all be in order, so break
			if (!swapped) break;					
		}		
		
	}

}
