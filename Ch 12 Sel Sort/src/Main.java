
public class Main {

	/**
	 * 
	 * 
	 * @author Brandon Warbelton
	 * 
	 * 2/19/2013
	 */
	public static void main(String[] args) 
	{
		double[] array1 = {5.0, 4.4, 1.9, 2.9, 3.4, 3.5};
		
		System.out.print("Original: ");
		printArray(array1.length, array1);
		selectionSort(array1);
		System.out.print("Final: ");
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
		System.out.print("Swap: ");
		printArray(a.length, a);
	}

	public static int findMaximum(double[] a, int last) 
	{
		int maxIndex = last;
		for (int i = last; i >= 0 ; i--)
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
