package Set1;

public class Six {
	
	void method()
	{
		String s = "harshad";
		for(int i=0; i<s.length(); i++)
		{
			for(int j=i+1; j<s.length(); j++)
			{
				if(s.charAt(i) == s.charAt(j))
				{
					System.out.println(s.charAt(i));
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Six obj = new Six();
		obj.method();
	}

}
