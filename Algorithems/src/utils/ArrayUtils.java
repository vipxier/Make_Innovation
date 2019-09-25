package utils;

public class ArrayUtils {

	public static void printArray(int[] array)
	{
		StringBuilder strB = new StringBuilder();
		for(int i = 0; i < array.length; i ++)
		{
			strB.append(" " + array[i]);
		}
		
		System.out.println(strB.toString());
	}
}
