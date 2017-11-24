package pack1;

public class DemoLoop {
	
	public static void main(String[] args)
	{
/*		int i = 1;
		
		while (i<10)
			
		{
			System.out.println(i);
			i++;
		}
		
		do {
			System.out.println(i);
			i++;
			
		}while (i<10);
		
		for (int i = 1; i<=10; i++)
		{
			System.out.println(i);
		} */
		
		
		for (int i=1; i<=4; i++)
		{
			for (int j =1; j<=4; j++)
			{
				if (i==3)
					break;
				System.out.print("* ");
			}
			System.out.println("");
		}
		
	}

}
