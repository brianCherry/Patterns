package com.patterns.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO - Fill in description.
 */
public class IteratorEverydayDemo {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();

		names.add("Brian");
		names.add("Jordan");
		names.add("Kelly");

		//Iterator<String> namesItr = names.iterator();
		// while(namesItr.hasNext()) {
		//	String name = namesItr.next();
		//	System.out.println(name);
		//	// namesItr.remove();
		//}
		for (String name: names) {
			System.out.println(name);
		}

		System.out.println("Names size: " + names.size());
	}
}
