package com.cpg.map.hashmap;

import java.util.Comparator;

public class SortedAge implements Comparator<Student1>{

	@Override
	public int compare(Student1 o1, Student1 o2) {
		if(o1.age>o2.age)
			return 1;
			else if(o1.age<o2.age)
				return -1;
			else
			return 0;
	}

	
}
