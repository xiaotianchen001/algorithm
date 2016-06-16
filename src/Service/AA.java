package Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class AA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List ar = new ArrayList();
		ar.add(6);
		ar.add(9);
		ar.add(3);
		ar.add(7);
		System.out.println(ar);

		Hashtable ha = new Hashtable();
		ha.put(1, 1);
		ha.put(2, 7);
		ha.put(3, 3);
		ha.put(4, 4);
		ha.put(4, 9);
		System.out.println(ha);
		
		LongPalindrome l=new LongPalindrome();
		String str="daabbbaadc";
		l.find(str);
		Stack s=new Stack();
		s.push(3);
		s.push(4);
		s.push(2);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.add(0, 9);
		System.out.println(s);
		
		int []a={1,5,4,2};
	   Arrays.sort(a);
	   System.out.println(a[2]);
		
		
	}

}
