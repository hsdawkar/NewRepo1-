package Set1;

public class Two {
	
	public void method()
	{
		int a = 1;
		int b = 5;
		
		a = a+b;//6
		b= a-b;//1
		a= a-b;//5
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		Two obj = new Two();
		obj.method();
	}

}
