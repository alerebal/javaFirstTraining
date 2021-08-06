package dataStructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		// Define the collection
//		HashSet<String> animals = new HashSet<String>();
		
		// HashSet - complete random order
//		Set<String> animals = new HashSet<String>();
		
		// LinkedHashSet - in order that they were entered
		Set<String> animals = new LinkedHashSet<String>();
		
		// TreeSet - rearranges to natural order
//		Set<String> animals = new TreeSet<String>();

		
		// Add elements
		animals.add("dog");
		animals.add("snake");
		animals.add("cat");
		animals.add("pig");
		
		System.out.println(animals);
		
		// Create a new set for comparison
		Set<String> farmAnimals = new HashSet<String>();
		farmAnimals.add("horse");
		farmAnimals.add("dog");
		farmAnimals.add("goose");
		farmAnimals.add("pig");
		
		System.out.println(farmAnimals);
		
		// What is the INTERSECTION between animals and farmAnimals
		// copy existing set into a new set
		Set<String> intersectionSet = new HashSet<String>(animals);
//		System.out.println(intersectionSet);
		
		// Retain ONLY the elements that are also in the other set
		intersectionSet.retainAll(farmAnimals);
		System.out.println("The intersection is: " + intersectionSet);
		
		// What is the Union
		Set<String> unionSet = new HashSet<String>(farmAnimals);
		unionSet.addAll(animals);
		System.out.println("The union is: " + unionSet);
		
		// What is the difference (animals but NOT farmAnimals)
		Set<String> diffSet = new HashSet<String>(animals);
		diffSet.removeAll(farmAnimals);
		System.out.println("The difference is: " + diffSet);

		Set<String> diffSet2 = new HashSet<String>(farmAnimals);
		diffSet2.removeAll(animals);
		System.out.println("The difference 2 is: " + diffSet2);
		
		
	}

}
