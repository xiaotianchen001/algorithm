package Service;

public class LongPalindrome {

	public void find(String input)
	{
		char[] st=input.toCharArray();
		char []s=new char[input.length()*2+1];
		s[0]='$';
		
		int j=0;
		for(int i=1;i<s.length;i++)
		{
			
			s[i]=st[j++];
			s[++i]='#';
		}
	
		System.out.println(s);
		
		
		int id = 0;  
	    int mx = 0;  
	    int longestnum = 1;  
	    int longestid = 0;  
	    int[] p = new int[s.length];  
	    for(int i=1; i<s.length; i++)  
	    {  
	        if(mx>i)  
	            p[i]=Math.min(p[id*2-i],mx-i);  
	        else  
	            p[i]=1;  
	        while( i+p[i]<s.length&&i-p[i]>0&& (s[i+p[i]] == s[i-p[i]]))
	            p[i]++;  
	        if(p[i]+i>mx)  
	        {  
	            mx=p[i]+i;  
	            id=i;  
	        }  
	        if(p[i]>longestnum)  
	        {  
	            longestnum=p[i];  
	            longestid = i;  
	        }  
	}
	    
	    System.out.println(longestnum+" "+longestid);
	}
}

