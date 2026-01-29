package collections;

import java.util.*;

public class MapDemo {
	private Map<String, Integer> sightings;

	public MapDemo() {
		sightings = new HashMap<String, Integer>();
		sightings.put("fox", 10);
		sightings.put("elk", 20);
		sightings.put("bear", 2);
	}
	public void printSightings() {
		Set<String> keySet = sightings.keySet();
		for (String key : keySet) {
			System.out.println(key + " -> " + sightings.get(key));
		}
	}	
	
	public static void main(String[] args) {
		MapDemo md = new MapDemo();
		md.printSightings();

	}

}
