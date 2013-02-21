
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		double[] array1 = {5.0, 4.4, 1.9, 2.9, 3.4, 3.5};
		int tempIndex;
		
		//selectionSort(array1);
		tempIndex = findMaximum(array1, 0);
		System.out.println(tempIndex);
		printArray(array1.length, array1);
		selectionSort(array1);
		printArray(array1.length, array1);
		
	}
	
	public static void selectionSort(double[] a)
	{
		for (int i = a.length - 1; i > 0; i--)
		{
			int maxIndex = findMaximum(a, i);
			if (maxIndex != i)
				swap(a, i, maxIndex);
		}
	}

	public static void swap(double[] a, int x, int y) 
	{
		double temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

	public static int findMaximum(double[] a, int first) 
	{
		int maxIndex = first;
		for (int i = first + 1; i < a.length ; i++)
		{
			if (a[i] > a[maxIndex])
				maxIndex = i;
		}
		
		return maxIndex;
	}
	public static void printArray(int arrayLength, double[] array)
	{
		String str = "";
		for (int i = 0; i < arrayLength; i++)
		{
			if (i != arrayLength - 1)
				str += array[i] + ", ";
			else
				str += array[i]; 
		}

		System.out.println(str);
	}
}
