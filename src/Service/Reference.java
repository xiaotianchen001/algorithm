package Service;

public class Reference {

	
	private String a;
	public static void main(String[] args)
	{
		Reference re1=new Reference();
		re1.a="3";
		Reference re2=new Reference();
		re2=re1;
		re1.a="4";
		System.out.println(re2.a);
	}
	
}
