package activities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Activity9 {

	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<>();
		myList.add("name1");
		myList.add("name2");
		myList.add("name3");
		myList.add("name4");
		myList.add("name5");
		
		Iterator<String> it = myList.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("3rd Element: "+myList.get(2));
		System.out.println("Is name4 present: "+ myList.contains("name4"));
		System.out.println("Total ArrayList size: "+ myList.size());
		
		myList.remove("name2");
        
        System.out.println("New ArrayList size: " + myList.size());
        System.out.println(myList);

	}

}
