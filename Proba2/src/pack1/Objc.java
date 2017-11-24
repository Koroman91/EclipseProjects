package pack1;

public class Objc {
	
	public static void main(String[] args)
	{
		Objc obj = new Objc();
		obj.show(4,2,2);
		
	}
//vargars variable	
	public void show(int ...a)
	{
		for (int i : a)
		{
		System.out.println(i);
		}
	}
	
	
	
	

}
