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
		
		//converts a string to an arraylist
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
		
		System.out.println("Original:");
		printArrayList(sentenceList);
		sort(sentenceList);
		System.out.println("Sorted:");
		printArrayList(sentenceList);
		removeDuplicates(sentenceList);
		System.out.println("Duplicates Removed:");
		printArrayList(sentenceList);
		addWord(sentenceList, "maple");
		addWord(sentenceList, "able");
		addWord(sentenceList, "zebra");
		System.out.println("Words Added:");
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
		for(int i = 0; i < list.size(); i++)
		{
			for(int u = i + 1; u < list.size(); u++)
			{
				if(list.get(i).compareToIgnoreCase(list.get(u)) == 0)
					{
						list.remove(i);
						i--;
					}
			}
		}
	}
	
	public static void addWord(ArrayList<String> list, String word)
	{
		String tmp = "";
		list.add(word);
		
		
		for(int i = list.size() - 1; i >= 0; i--)
		{
			for(int u = i - 1; u >= 0; u--)
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
}

/*
Original:
The big black bear and the big black dog ran down the road
Sorted:
The and bear big big black black dog down ran road the the
Duplicates Removed:
and bear big black dog down ran road the
Words Added:
able and bear big black dog down maple ran road the zebra
*/