package pack1;

public class Nasledjivanje {
	
	public static void main(String[] args)
	{
		B obj = new B(5);
	}
}
	class A{
		
		public A()
		{
			System.out.println("In A Const");
		}
		public A(int i)
		{
			
			System.out.println("In A Const int");
		}
	}
	class B extends A {
		
		public B()
		{
			
			System.out.println("In B Const");
		}
		public B(int i)
		{
			
			System.out.println("In B Const int");
		}
	}

