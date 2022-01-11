package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {

	public static void main(String[] args) {
		
		Map<Integer,String> myMap = new HashMap<Integer,String>();		
		myMap.put(1, "Red");
		myMap.put(2, "Blue");
		myMap.put(3, "Yellow");
		myMap.put(4, "Green");
		myMap.put(5, "Black");
        
		System.out.println("Print Map: " + myMap);
		System.out.println("Remove Yellow: " + myMap.remove(3));
		System.out.println("Print Map after emoving Yellow: " + myMap);
		if(myMap.containsValue("Green"))
		{
			System.out.println("Green color is Present in the map");
		}
		else
		{
			System.out.println("Green color is NOT Present in the map");
		}
		System.out.println("Size of the Map is: " + myMap.size());
	}

}
