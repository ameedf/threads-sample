package com.ameed.threads;

import java.util.Comparator;

public class ComparePersonsByAge implements Comparator<Person> {

	public int compare(Person o1, Person o2) {
		int age1 = o1.getAge();
		int age2 = o2.getAge();

		return age1 - age2;
	}

}
