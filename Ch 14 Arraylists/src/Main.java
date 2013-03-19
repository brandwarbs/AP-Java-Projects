import java.util.ArrayList;


public class Main {

	/**
	 * @author Brandon Warbelton
	 */
	public static void main(String[] args) 
	{
		ArrayList<String> sentenceList = new ArrayList<String>();
		String sentence = "The big black bear and the big black dog ran down the road";
		String tmpString = "";
		
		for(int i = 0; i < sentence.length(); i++)
		{
			if(sentence.charAt(i) == ' ')
			{
				sentenceList.add(tmpString);
				tmpString = "";
			}
			
			else
				tmpString += sentence.charAt(i);
			if(i == sentence.length() - 1)
			{
				sentenceList.add(tmpString);
				tmpString = "";
			}
		}
		
		
		printArrayList(sentenceList);
		sort(sentenceList);
		printArrayList(sentenceList);
		removeDuplicates(sentenceList);
		printArrayList(sentenceList);
	}

	public static void printArrayList(ArrayList<String> list)
	{
		String str = "";
		for (int i = 0; i < list.size(); i++)
		{
			if (i != list.size() - 1)
				str += list.get(i) + " ";
			else
				str += list.get(i); 
		}
		
		System.out.println(str);
	}
	
	public static void sort(ArrayList<String> list)
	{
		String tmp = "";
		
		for(int i = 1; i < list.size(); i++)
		{
			for(int u = 0; u < list.size(); u++)
			{
				if(list.get(i).compareTo(list.get(u)) < 0)
					{
						tmp = list.get(i);
						list.set(i, list.get(u));
						list.set(u, tmp);
					}
			}
		}
	}
	
	public static void removeDuplicates(ArrayList<String> list)
	{
		for(int i = 1; i < list.size(); i++)
		{
			for(int u = 0; u < list.size(); u++)
			{
				if(list.get(i).compareToIgnoreCase(list.get(u)) == 0)
					{
						list.remove(i);
					}
			}
		}
	}
}
