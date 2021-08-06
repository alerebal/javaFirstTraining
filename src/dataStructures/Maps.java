package dataStructures;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		// Implement the interface
//		Map<Integer, String> hMap = new HashMap<Integer, String>();
//		Map<Integer, String> hMap = new LinkedHashMap<Integer, String>();
		Map<Integer, String> hMap = new TreeMap<Integer, String>();

		mapUtil(hMap);

	}
	
	public static void mapUtil(Map<Integer, String> map) {
		// Add elements
		map.put(3, "Alejandro");
		map.put(1, "Analía");
		map.put(2, "Azul");
		map.put(5, "Facundo");
		map.put(4, "Jimi");
		
		System.out.println("Keys: " + map.keySet());
		System.out.println("Values: " + map);
		
		for(int k: map.keySet()) {
			System.out.println("[ Key: " + k + " - Value: " + map.get(k) + " ]");
		}
	}

}
