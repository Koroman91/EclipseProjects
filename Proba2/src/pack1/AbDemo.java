package pack1;

public class AbDemo {

	public static void main(String[] args)
	{
		//MaheshPhone obj = new MaheshPhone(); // ne moze se instatiate the abstract class-u
		//obj.call();
		
		MaheshPhone obj = new SureshPhone();
		obj.call();
		obj.move();
		obj.dance();
		obj.cook();
	}
	
}

abstract class MaheshPhone{
	
	public void call()
	{
		System.out.println("Calling");
	}
	
	public abstract void move();
	public abstract void dance();
	public abstract void cook();
}

abstract class RameshPhone  extends MaheshPhone{
	
	public void move()
	{
		System.out.println("Moving");
	}
	
}

class SureshPhone extends RameshPhone{
	
	public void dance(){
		System.out.println("Dancing");
	}
	
	public void cook()
	{
		System.out.println("Cooking");
	}
}
