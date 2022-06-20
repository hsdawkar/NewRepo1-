package Set1;

public class Four {
	
	void palindromeNo() 
	{
		int x = 12321;
		int a= x%10;//1
		int b= x%100 - a;//20
		int c= x%1000 - a - b;//300
		int d= x%10000 - a - b - c;//2000
		int e= x%100000 - a - b - c - d; //10000
		
		int y = a*10000 + b*100 + c + d/100 + e/10000;
		
		if(x==y)
		{
			System.out.println("x is a palindrome no");
		}
		
		else
		{
			System.out.println("x is not a palindrome no");
		}
	}
	
	void revNum()
	{
		int num = 12535; 
		int rev = 0; 
		
		while(num !=0)              
		{
			rev =rev *10+ num % 10; 
			num = num/10;
		}
			System.out.println("reversed num is "+rev);
	}
	
	public static void main(String[] args) {
		Four o1 = new Four();
		o1.palindromeNo();
		o1.revNum();
	}

}
