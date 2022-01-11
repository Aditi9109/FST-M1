package activities;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {
	
	public static void main(String[] args) {
		
		Set<String> hs = new HashSet<>();
		
		hs.add("Object1");
		hs.add("Object2");
		hs.add("Object3");
		hs.add("Object4");
		hs.add("Object5");
		hs.add("Object6");
		
		System.out.println("Size of HashSet: "+hs.size());
		System.out.println("remove object5 from HashSet "+hs.remove("Object5"));
		System.out.println("remove object7(not present) from HashSet "+hs.remove("Object7"));
		if(hs.remove("Object7")) {
        	System.out.println("Object7 removed from the Set");
        } else {
        	System.out.println("Object7 is not present in the Set");
        }
		
		System.out.println("Is Object2 present?: "+hs.contains("Object2"));
		
		System.out.println("Updated HashSet: "+hs);
	}

}
