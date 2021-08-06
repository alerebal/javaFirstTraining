package dataStructures;

import java.util.ArrayList;

public class Lists {
	public static void main(String[] args) {
		// Create a collection
		ArrayList<String> cities = new ArrayList<String>();
		
		// Add some elements
		cities.add("Buenos Aires");
		cities.add("Barcelona");
		cities.add("Paris");
		cities.add("Dublin");
		
		// Iterate the collection
		for(String city: cities) {
			System.out.println(city);
		}
		
		// Get the size
		int size = cities.size();
		System.out.println(size);
		
		// Retrieve specific element
		System.out.println(cities.get(2));
		
		// Remove element
		cities.remove(2);
		
		System.out.println("*******************");
		
		for(String city: cities) {
			System.out.println(city);
		}

		System.out.println(cities);
		
		
	}
}
