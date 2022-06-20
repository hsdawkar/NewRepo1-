package assgn;

public class pract1 {

	public void method1()
	{
		int ar[] = {12,67,52,20,6};
		int max;
		
		for(int i=0; i<ar.length; i++)
		{
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]<ar[j])
				{
					max=ar[i];
					ar[i]=ar[j];
					ar[j]=max;
				}
			}
		}
		
		for(int i=0; i<ar.length; i++)
		{
			System.out.println(ar[i]); //sorting
		}
		
		System.out.println("Second highest no is: "+ar[1]);
		System.out.println("second min no is : "+ar[ar.length-2]);
	}
	
	public void method2()
	{
		int a[] = {12,67,52,10,6};
		int min;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i] > a[j])
				{
					min=a[i];
					a[i]=a[j];
					a[j]=min;
				}
			}
		}
		System.out.println("second min no is : "+a[1]);
	}
	
	public static void main(String[] args) {
		pract1 o = new pract1();
		o.method1();
	}
}
