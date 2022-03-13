package activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("Volvo");
		hs.add("BMW");
		hs.add("Hyundai");
		hs.add("Ford");
		hs.add("Benz");
		hs.add("Mazda");
		System.out.println("Size of Hashset:"+""+hs.size());
		if(hs.remove("Volvo")) {
        	System.out.println("Volvo removed from the Set");
        } else {
        	System.out.println("Volvo is not present in the Set");
        }
		System.out.println("Checking if Mazda is present:"+""+hs.contains("Mazda"));
		System.out.println("Updated HashSet: " + hs);
				
	}

}
