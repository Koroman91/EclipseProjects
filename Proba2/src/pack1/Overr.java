package pack1;

public class Overr {
	
	public static void main(String[] args)
	{
		B3 obj = new B3();
		obj.show();
	}
}
	class 	A3 {
		public void show()
		{
			System.out.println("In A case");
		}
	}
	
	class B3 extends A3{
		public void show()
		{
			System.out.println("In B case");
		}
	}


