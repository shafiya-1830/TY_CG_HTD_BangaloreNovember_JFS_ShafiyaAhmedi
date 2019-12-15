package com.cpg.map.hashmap;

import java.util.Comparator;

public class SortedName implements Comparator<Student1> {

	@Override
	public int compare(Student1 o1, Student1 o2) {
		return o1.name.compareTo(o2.name);
	}

}
