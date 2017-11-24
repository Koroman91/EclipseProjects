package pack1;

public class Overl {
	
	
	public static void main(String[] args)
	{
	   ovr obj = new ovr();
	   obj.show();
	}
	
}
class ovr{
	
	public void show()
	{
	  System.out.println("Hello!");	
	}
	public void show(int i)
	{
		System.out.println("Hello " +i);
	}
	public void show(double i)
	{
	    System.out.println("Hello double!");	
	}

}
