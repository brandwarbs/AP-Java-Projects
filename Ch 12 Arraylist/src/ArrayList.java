
public class ArrayList 
{
	int[] someArray;
	public ArrayList()
	{
		someArray = new int[5];
	}
	
	public ArrayList(int size)
	{
		someArray = new int[size];
	}
	
	public ArrayList(int[] ary)
	{
		someArray = ary;
	}
	
	public String toString()
	{
		String str = "";
		for (int i = 0; i < someArray.length; i++)
		{
			if (i != someArray.length - 1)
				str += someArray[i] + ", ";
			else
				str += someArray[i]; 
		}

		return str;
	}
}
