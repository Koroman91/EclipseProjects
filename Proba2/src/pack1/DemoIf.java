package pack1;

public class DemoIf {
	
	public static void main(String args[])
	{
		int num1 = 8;
		
		if (num1 %2 ==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
		
		int a, b, c;
		
		a=4;
		b=3;
		c=8;
		
		if (a > b && a > c)
		{
			System.out.println("A");
		}
		else if (b > c)
		{
		    System.out.println("B");
		}
		else
		{
			System.out.println("C");
		}
		
		int i = 1;
		int j = 5;
		
		if (i==1)
		{
			j=6;
		}
		else
		{
		    j=7;	
		}
		System.out.println(j);
		
		
		//ternary operator
		
		int k = i==4?2:3;
		System.out.println(k);
		
	}

}
