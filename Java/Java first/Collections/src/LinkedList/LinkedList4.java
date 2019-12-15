package LinkedList;

import java.util.LinkedList;

public class LinkedList4 {

	public static void main(String[] args) {
		
		LinkedList l1=new LinkedList();
		l1.add(1);
		l1.add(19);
		l1.add(29);
		l1.add(39);
		System.out.println(l1);
		
		l1.push(0);
		System.out.println(l1);
		
		l1.pop();
		System.out.println(l1);
		
		System.out.println(l1.element());
		System.out.println(l1);

	}

}
