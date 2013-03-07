
public class Main {
	
	
	/**
	 * @param args
	 */
	public static void main(String [] args) 
	{
		int[][] m1 = {{2, 3, -1},
					{5, -2, 2}};
		int[][] m2 = {{5, 3}, 
					{1, -1}, 
					{-2, 0}};
		int[][] m3 = {{1, 2},
					{3, 4}};
		int[][] m4 = {{-2, 4},
					{7, 3}};
		
		System.out.println(canAdd(m3, m4));
		System.out.println(canAdd(m1, m2));
		System.out.println(canAdd(m3, m2));
		System.out.println(canAdd(m1, m4));
		System.out.println(stringMatrix(addMatrix(m3, m4)));
		System.out.println(stringMatrix(addMatrix(m2, m4)));
		System.out.println(stringMatrix(addMatrix(m3, m4)));
		System.out.println(stringMatrix(addMatrix(m1, m4)));
		System.out.println(canMultiply(m3, m4));
		System.out.println(canMultiply(m1, m2));
		System.out.println(canMultiply(m3, m2));
		System.out.println(canMultiply(m1, m4));
		System.out.println(stringMatrix(multiplyMatrix(m1, m2)));
	}

	public static int[][] addMatrix(int[][] matrix1, int[][] matrix2)
	{
		int[][] aMatrix = {{0, 0},{0, 0}};
		if(canAdd(matrix1, matrix2))
		{
			int[][] theMatrix = new int[matrix1.length][matrix1.length];
			for(int i = 0; i < matrix1.length; i++)
			{
				for(int u = 0; u < matrix1[i].length; u++)
				{
					theMatrix[i][u] = matrix1[i][u] + matrix2[i][u];
				}
			}
			
			return theMatrix;
		}
		
		
		return aMatrix;
	}
	
	public static boolean canAdd(int[][] trix1, int[][] trix2)
	{
		boolean size = true;
		int firstSize = trix1.length;
		if(firstSize != trix2.length)
			size = false;
		
		for(int i = 0; i < trix1.length; i++)
		{
			if(firstSize != trix1[i].length)
				size = false;
		}
		for(int i = 0; i < trix2.length; i++)
		{
			if(firstSize != trix2[i].length)
				size = false;
		}
		
		return size;
	}
	
	public static String stringMatrix(int[][] mat)
	{
		String str = "";


		for(int i = 0; i < mat.length; i++)
		{
			for(int u = 0; u < mat[i].length; u++)
			{
				str += mat[i][u] + " "; 
			}
			if(i != mat.length - 1)
				str += "\n";
		}

		return str;
	}
	
	public static boolean canMultiply(int[][] trix1, int[][] trix2)
	{
		boolean size = true;
		int firstSize = trix2.length;
		
		for(int i = 0; i < trix1.length; i++)
		{
			if(firstSize != trix1[i].length)
				size = false;
		}
		
		return size;
	}
	
	public static int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2)
	{
		int[][] aMatrix = {{0, 0},{0, 0}};
		if(canMultiply(matrix1, matrix2))
		{
			int[][] theMatrix = new int[matrix1.length][matrix2[0].length];
			int sum = 0;
					
	         for (int c = 0 ; c < matrix1.length ; c++ )
	         {
	            for (int d = 0 ; d < matrix2[0].length ; d++ )
	            {   
	               for (int k = 0 ; k < matrix2.length ; k++ )
	               {
	                  sum = sum + matrix1[c][k]*matrix2[k][d];
	               }
	 
	               theMatrix[c][d] = sum;
	               sum = 0;
	            }
	         }
			
			return theMatrix;
		}
		
		
		return aMatrix;
	}
	
}
