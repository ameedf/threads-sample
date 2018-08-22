package com.ameed.threads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparingApplication {
	public static void main(String[] args) {

		List<String> list = Arrays.asList("a", "c", "q", "d");
		Collections.sort(list);

		for (String s : list) {
			System.out.println(s);
		}

		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("first4", "last4", 14));
		persons.add(new Person("first1", "last1", 11));
		persons.add(new Person("first3", "last3", 13));
		persons.add(new Person("first2", "last2", 12));

		Collections.sort(persons, new ComparePersonsByAge());
		
		for (Person person : persons) {
			System.out.println(person);
		}
	}
}
