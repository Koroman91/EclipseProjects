package pack1;

public class AbDemo1 {
	
	public static void main(String [] args)
	{
		Iphone obj = new Iphone();
		SamsungS4 obj1 = new SamsungS4();
		show(obj1);
	}
    public static void show(Phone obj)
    {
    	obj.showConfig();
    }

}

abstract class Phone{
	public abstract void showConfig();
}



class Iphone extends Phone{
	
	public void showConfig()
	{
		System.out.println("2 GB, IOS 9.3");
	}
	
}

class SamsungS4 extends Phone{
	
	public void showConfig()
	{
		System.out.println("2 gb, Lolipop");
	}
}