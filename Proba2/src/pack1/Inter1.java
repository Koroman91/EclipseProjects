package pack1;

public class Inter1 {
	

	
	public static void main(String[] args)
	{
		Demo3 obj = new Demo3();
		if (obj instanceof P)
		{
			obj.show();
		}
		else
		{
			System.out.println("false");
		}
	}

}
interface P {
	
}

class Demo3 implements P {
	
	  void show()
	{
		System.out.println("hello");
	}
	
}
