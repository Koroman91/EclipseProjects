package pack1;

import java.util.Random;

public class Array {
	
	public static void main(String[] args)
	{
		Random r = new Random();
		
		int a[] = new int[5];
	    a[0] = 2;
	    a[1] = 6;
	    a[2] = 8;
	    a[3] = 4;
	    a[4] = 1;
	    
	    
	    
	    
	    for (int i = 0; i<a.length; i++)
	    {
	
	    a[i]=r.nextInt(50);
	    }
		// petlja koja radi isto - enhanced for loop
	    
	    //System.out.println(a[3]);
	    
	    
	    try
	    {
	      System.out.println(a[8]);	
	    } 
	    catch(ArrayIndexOutOfBoundsException e)
	    {
	    	System.out.println("Maximum number of element is 4.");
	    }
	    
	    
	    
	    
	    for(int i : a)
	    {
	    	System.out.println(i);
	    }
	    
	    
	}

}
