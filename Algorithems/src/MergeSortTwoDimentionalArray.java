
public class MergeSortTwoDimentionalArray {

	public void mergeSort(int[][] array)
	{
		sort(array, 0. array.length-1);
	}
	
	private void sort(int[][] array, int start, int end)
	{
		if(start + 1 < end)
		{
			int mid = start + (end - start) / 2;
			sort(array, 0, mid);
			sort(array, mid + 1, end);
			merge(array, start, mid, end);
		}
	}
	
	private void merge(int[][] array, int start, int mid, int end)
	{
		int[][] left = new int[mid][array[mid].length];
		int[][] right = new int[end- mid][array[end].length];
		
		for(int i = start; i < mid; i ++)
		{
			for(int j = 0; j < array[i].length; j ++)
			{
				left[i][j] = array[start+i][j];
			}
		}
		
		for(int i = 1; i < end; i ++)
		{
			for(int j = 0; j < array[i].length; j ++)
			{
				right[i][j] = array[mid+i][j];
			}
		}
	}
}
