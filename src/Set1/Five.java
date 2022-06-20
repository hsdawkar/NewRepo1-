package Set1;

public class Five {
	
	void methodFibonacci()
	{
		int a1=0, a2=1, a3;
		System.out.print(a1 +" "+a2);
		
		for(int i=2; i<10; i++)
		{
			a3=a1+a2;
			System.out.print(" "+a3);
			a1=a2;
			a2=a3;
		}
	
	}
	
	public static void main(String[] args) {
		Five o2 = new Five();
		o2.methodFibonacci();
	}

}
