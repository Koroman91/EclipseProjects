package pack1;

public class DemoException4 {
	
	public static void main(String[] args)
	{
		int i = 8;
		
		
		try {
			if (i<10)
			{
				throw new MyException("Error!!!");
				
			}
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}

class MyException extends Exception{
    
	 public MyException(String msg)
	 {
		 super(msg); 
	 }
}
