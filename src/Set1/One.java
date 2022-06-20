package Set1;

public class One {
	
	int c;
	
	public void swap()
	{
		int a = 10;
		int b = 22;	
		c=a;
		a=b;
		b=c;;
		
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		One ob = new One();
		ob.swap();
		
	}

}
