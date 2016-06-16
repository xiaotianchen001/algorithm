package Service;

import java.util.HashSet;
import java.util.Set;

public class Hashoverwrite {

	public static void main(String[] args) {
		Set<Student> set=new HashSet();
		
		set.add(new Student("nimei"));
		System.out.println(set.contains(new Student("nimei")));
	}

}
