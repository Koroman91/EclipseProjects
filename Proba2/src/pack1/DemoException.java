package pack1;

public class DemoException {
	
	public static void main(String [] args)
	{
		int i,j,k=0;
		
		i=8;
		j=2;
		int a[] = new int[4];
		
		
		try{
		
		k = i/j;
		for (int c=0; c<=4; c++){
			a[c]=c+1;
		}
		
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot allowed division with 0" +e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Maximum Number of values is 4");
		}
		System.out.println(k);
	}

}
