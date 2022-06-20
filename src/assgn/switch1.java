package assgn;

import java.util.Scanner;

public class switch1 {
	
	char datatype;
	void method()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String value");
		String s = sc.nextLine();
		
		System.out.println("Enter integer value");
		int a = sc.nextInt();
		
		System.out.println("Enter float value");
		float m = sc.nextFloat();
		
		switch(datatype)
		{
		case 1:
			System.out.println("entered value's data type is string");
			break;
		
		case 2:
			System.out.println("entered value's data type is integer");
			break;
		case 3:
			System.out.println("entered value's data type is float");
			break;
			
		default :
			System.out.println("this is default case");
		}
	}
		
		public static void main(String[] args)
		{
		   switch1 o = new switch1();
		   o.method();
		}
	

}
