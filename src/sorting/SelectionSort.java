package sorting;

public class SelectionSort {
	
	void sort(int arr[]) 
	{
		
		int n = arr.length;
		
		for(int i = 0; i < n-1; i++) 
		{
		
			int min = i;
									
			//Find the minimum element
			for(int j = i+1; j < n; j++) 
			{
				if(arr[j] < arr[min]) 
				{
					min = j;
				}				
			}
						
			//swap
			int temp = arr[min];			
			arr[min] = arr[i];
			arr[i] = temp;				
			
		}
		
	}

}
