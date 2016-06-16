package Service;

public class MultiThreeNums {

	public static void main(String[] args)
	{
		
		
		int a[]={-1,-1,-1};
		int max = java.lang.Integer.MIN_VALUE;
		int mid=max;
		int min=max;
		int neg1=0;
		int neg2=0;
		if(a.length<3)
		{
			System.out.println("lenth is not long enough.");
			
		}
		else
		{
			for (int i = 0; i < a.length; i++) {
				if(a[i]>max)
				{
					min=mid;
					mid=max;
					max=a[i];
				}
				else
				{
					if(a[i]>mid)
					{
						min=mid;
						mid=a[i];
						
					}
					else
					{
						if(a[i]>min)
						{
							min=a[i];
						}
					}
					
				}
				
				if(a[i]<0)
				{
					if(a[i]<neg1)
					{
						neg2=neg1;
						neg1=a[i];
						
					}
					
					else
					{
						if(a[i]<neg2)
						{
							neg2=a[i];
						}
					}
				}
				
			}
			System.out.println(max+" "+mid+" "+min);
			if(neg1*neg2==0)
			{
				System.out.println(max*mid*min);
				
			}
			else
			{
				if(neg1*neg2*max>max*mid*min)
				{
					System.out.println(neg1*neg2*max);
				}
				else
				{
					System.out.println(max*mid*min);
				}
			}
			
		}
		
		
		
		
		
	}
}
