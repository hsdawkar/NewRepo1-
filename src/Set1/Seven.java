package Set1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Seven {
	
	static void methodJ()
	{
		List<Integer> num = new ArrayList<Integer>();
		num.add(15);
		num.add(56);
		num.add(33);
		num.add(12);
		num.add(97);
		Collections.sort(num);
		System.out.println(num);
		
		System.out.println("second highest no is "+num.get(num.size()-2));
	}
	
	public static void main(String[] args) {
		methodJ();
	}

}
