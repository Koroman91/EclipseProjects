package pack1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoException1 {
	
	public static void main(String[] args)
	{
	
	int i, j, k=0;
	
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	
	i=8;
	
	
    
        try{
		
        	j = Integer.parseInt(bf.readLine());	
		    k = i/j;
	
		}
        catch(IOException e)
        {
        	System.out.println("Some IO Error");
        }
		catch(ArithmeticException e)
		{
			System.out.println("Cannot allowed division with 0" +e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Maximum Number of values is 4");
		}
/*		finally
		{
	        System.out.println("bye");

		}*/
        System.out.println(k);
	
	
	
   }
}