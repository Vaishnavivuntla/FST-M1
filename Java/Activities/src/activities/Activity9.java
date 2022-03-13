package activities;

import java.util.ArrayList;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Vuntla");
		myList.add("Vaishnavi");
		myList.add("Adam");
		myList.add("James");
		myList.add("Denis");
		for(int i=0; i<myList.size(); i++)
		{
			System.out.println(myList.get(i));
		}
		System.out.println("Third Name in the Array List is:"+""+myList.get(2));
		System.out.println("Is James present in the arrayList:"+""+myList.contains("James"));
		int length = myList.size();
		System.out.println("Number of names in the ArrayList is:"+""+length);
		myList.remove(1);
		int length1 = myList.size();
		System.out.println("Number of names in the ArrayList after removing:"+""+length1);
		
	}

}
