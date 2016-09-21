package com.patterns.java8test;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO - Fill in description.
 */
public class TestMap {

	public static void main(String[] args) {

		/* List<Class1> class1 = Arrays.asList(new Class1("Brian", "awesome"), new Class1("Brian", "Awesomeness"));

		List<Class2> class2 = class1.stream().map( classConvert -> {
														Class2 class2Convert = new Class2(classConvert.getName(), classConvert.getValue());
														return class2Convert;
												   }
		).collect(Collectors.toList());

		class2.forEach(out -> System.out.println(out.toString())); */
		Map<String, String> map = new HashMap<>();
		map.put("Brian", "brian");
		String test = map.get("Brian");
		String testFail = map.get("Not there");


	}


}
