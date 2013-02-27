
public class ArrayList 
{
	Object[] someArray;
	public ArrayList()
	{
		someArray = new Object[5];
	}
	
	public ArrayList(int size)
	{
		someArray = new Object[size];
	}
	
	public ArrayList(Object[] ary)
	{
		someArray = ary;
	}
	
	public String toString()
	{
		String str = "";
		boolean isNull = false;
		
		for (int i = 0; i < someArray.length; i++)
		{
			if(someArray[i] == null)
			{
				isNull = true;
				break;
			}
				
		}
		
		if(!isNull)
		{
			for (int i = 0; i < someArray.length; i++)
			{
				if (i != someArray.length - 1)
					str += someArray[i].toString() + ", ";
				else
					str += someArray[i].toString(); 
			}
		}
		else
		{
			str = "Array has a empty element";
		}

		return str;
	}
	
	public int size()
	{
		int theSize = 0;
		for (int i = 0; i < someArray.length; i++)
		{
		if(someArray[i] == null)
			break;
		else
			theSize++;
		}
		
		return theSize;
	}
	
	public Object get(int pos)
	{
		return someArray[pos];
	}
}
