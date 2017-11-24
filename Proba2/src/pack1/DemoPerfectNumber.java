package pack1;

public class DemoPerfectNumber {
	

	public static void main(String [] args)
	{
		int n = 28;
		boolean b = isPerfect(n);
		
		if (b)
		{
			System.out.println("It's a perfect number!");
		}
		else
		{
			System.out.println("It's not a perfect number!");
		}
	}
   //metoda
	
	public static boolean isPerfect(int n)
	{
		int sum = 0;
		
		for (int i=1;i<n/2;i++)
		{
			if (n%i==0)
			{
				sum = sum+i;
			}
		}
		if (n==sum)
		{
			return true;
		}
		return false;
	}
}
