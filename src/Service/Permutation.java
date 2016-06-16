package Service;

import java.io.IOException;

public class Permutation {

	public static void main(String[] args) throws IOException {
		
		
		int []a={1,2,3,4};
		int n=3;
		dopermutation(a,n);
		
		
	}

	private static void dopermutation(int[] a, int n) {
		dopart(a,n,"");
		
	}

	private static void dopart(int[] a, int n, String str) {
		if(n==1)
		{
			for (int i = 0; i < a.length; i++) {
				System.out.println(str+a[i]);
			}
			
		}
		else
		{System.out.println("sss");
			for (int i = 0; i < a.length; i++) {
				String s=str+a[i]+" ";
				
				int[] b=new int[a.length-1];
				int index=0;
				for (int j = 0; j < a.length; j++) {
					if(j!=i)
					{
						b[index]=a[j];
						index++;
						System.out.println(b[index-1]);
					}
					
				}
				dopart(b,n-1,s);
				
			}
			
		}
		
	}


}
