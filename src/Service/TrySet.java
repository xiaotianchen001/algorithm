package Service;

import java.util.HashSet;
import java.util.Set;

public class TrySet {

	public static void main(String[] args) {
		String a="abc";
		String b=a;
		a="ab";
		System.out.println(a+" "+b);
		StringBuffer st=new StringBuffer("aaa");
		st=st.append("b");
		String st1=st.toString();
		System.out.println(st1);
		StringBuffer st2=st;
		String st22=st2.toString();
		System.out.println(st22);
		
		int in1=2;
		int in2=in1;
		in1=3;
		System.out.println(in2);
		
	}

}
