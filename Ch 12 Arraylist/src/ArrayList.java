
/**
 * 
 * @author Brandon Warbelton
 *
 */

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
	
	public Object get(int index)
	{
		return someArray[index];
	}
	
	public Object remove(int index)
	{
		Object someObject = someArray[index];
		someArray[index] = null;
		return someObject;
	}
	
	public boolean add(int index, Object theObject)
	{
		boolean isTrue = true;
		
		if(index < 0)
		{
			index = 0;
		}
		else if(index > someArray.length - 1)
		{
			index = someArray.length - 1;
		}
		
		if(someArray[index] == null)
			someArray[index] = theObject;
		else
			isTrue = false;
		
		return isTrue;
	}
}
