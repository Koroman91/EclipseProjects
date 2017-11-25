package pack1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoException3 {
	
	public static void main(String [] args) throws Exception, IOException
	{
		int i,j, k=0;
		
		i = 8;
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		try
		{
			j = Integer.parseInt(bf.readLine());
			if (j < 10)
			{
				throw new ArithmeticException();
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Number is small");
		}
		finally
		{
			System.out.println("BYE");

		}
	}

}
