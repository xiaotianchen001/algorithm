package Service;

public class Combination1 {

	public static void main(String[] args) {
		int[] a={1,2,3,4};
		int n=3;
		docom(a,n);
	}

	private static void docom(int[] a, int n) {
		dopart(a,n,"");
		
	}

	private static void dopart(int[] a, int n, String string) {
		if(n==1)
		{
			for (int i = 0; i < a.length; i++) {
				System.out.println(string+" "+a[i]);
			}
			
		}
		else{
			
		
		
		for (int i = 0; i < a.length-(n-1); i++) {
			String str=string+" "+a[i];
			int[] b=new int[a.length-i-1];
			int index=0;
			for (int j = 0; j < a.length-i-1; j++) {
				b[j]=a[i+j+1];
				
			}
			dopart(b,n-1,str);
		}
		
		
		}
	}

}
