
public class TestList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList someList = new ArrayList(7);
		ArrayList list2 = new ArrayList();
		Object[] names = {"Fred", "George", "Tom"};
		ArrayList list3 = new ArrayList(names);
		
		System.out.println(someList.toString() + " | " + someList.size());
		System.out.println(list2.toString() + " | " + list2.size());
		System.out.println(list3.toString() + " | " + list3.size());
		
		System.out.println("1 of list 3: " + list3.get(0));
		System.out.println("remove 1 of list 3: " + list3.remove(0));
		System.out.println("1 of list 3: " + list3.get(0));
		System.out.println(list3.add(0, "Tony"));
		System.out.println("1 of list 3: " + list3.get(0));
		
		System.out.println(list3.toString() + " | " + list3.size());
		System.out.println(list3.add(1, "Sarah"));
		System.out.println(list3.toString() + " | " + list3.size());
	}

}

/*
Array has a empty element | 0
Array has a empty element | 0
Fred, George, Tom | 3
1 of list 3: Fred
remove 1 of list 3: Fred
1 of list 3: null
true
1 of list 3: Tony
Tony, George, Tom | 3
false
Tony, George, Tom | 3
*/