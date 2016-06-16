package Service;

import java.util.ArrayList;
import java.util.List;

public class SlidingWindow {

	public static void main(String[] args) {
		int[] a={4,2,5,7,6,8};
		int windowsize=4;
		solution(a,windowsize);
	}

	private static void solution(int[] a, int windowsize) {
		List li=new ArrayList();
		int num=0;
		for (int i = 0; i < windowsize; i++) {
			num=num+a[i];
		}
		
		li.add(num);
		for (int i = 0; i+windowsize < a.length; i++) {
			
			num=num+a[i+windowsize]-a[i];
			li.add(num);
			
		}
		
		System.out.println(li);
	}

}
