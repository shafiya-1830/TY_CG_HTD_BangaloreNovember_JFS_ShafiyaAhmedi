package Stack;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		
		Stack s1=new Stack();
		s1.push(29);
		s1.push(39);
		s1.push(49);
		System.out.println(s1);
		
		s1.pop();
		System.out.println(s1);
		
		System.out.println(s1.peek());
		System.out.println(s1);
		System.out.println(s1.search(29));
		

	}

}
