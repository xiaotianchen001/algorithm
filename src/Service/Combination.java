package Service;

import java.util.Iterator;
import java.util.Scanner;

public class Combination {

	public static void main(String[] args) {
		
		int []num=new int[4];
		Scanner ac=new Scanner(System.in);
	    for (int i = 0; i < num.length; i++) {
			num[i]=ac.nextInt();
		}
	    
for (int i = 0; i < num.length; i++) {
	
	for (int j = 0; j < num.length; j++) {
		if(j==i)
		{
			continue;
		}
		for (int j2 = 0; j2 < num.length; j2++) {
			if(j2==j||j2==i)
			{
				continue;
			}
		
			for (int k = 0; k < num.length; k++) {
				if(k==i||k==j||k==j2)
				{
					continue;
				}
				System.out.println(i+" "+j+" "+j2+" "+k);
			}
		}
	}
	
	
}   
	
	}

}
