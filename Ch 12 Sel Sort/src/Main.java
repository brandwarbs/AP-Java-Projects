
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double[] array1 = {5.0, 4.4, 1.9, 2.9, 3.4, 3.5};

	}
	
	void selectionSort(double[] a)
	{
		for (int i = 0; i < a.length - 1; i++)
		{
			int minIndex = findMinimum(a, i);
			if (minIndex != i)
				swap(a, i, minIndex);
		}
	}

	void swap(double[] a, int x, int y) {
		// TODO Auto-generated method stub
		
	}

	int findMinimum(double[] a, int first) {
		// TODO Auto-generated method stub
		return 0;
	}
}
