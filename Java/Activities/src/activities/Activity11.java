package activities;

import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> colours = new HashMap<Integer, String>();
		
		colours.put(1, "Yellow");
		colours.put(2, "Green");
		colours.put(3, "Red");
        colours.put(4, "Purple");
        colours.put(5, "Orange");
        System.out.println("Original map:"+" "+colours);
        colours.remove(3);
        System.out.println("Is the green colour present?"+" "+colours.containsValue("Green"));
        System.out.println("Size of Map:"+" "+colours.size());
        
	}

}
