package pack1;

public class Ths {
	
	public static void main(String[] args)
	{
       		A5 obj = new A5(6);
       		obj.show();
	}
}
	class A5 {
		
		private int x;  // varijabla instance, globalna
		
		public A5(int x)   // local varijabla
		{
			this.x=x; // this je keyword koja se odnosi na lokalnu varijablu
		}
		
		
		public void show()
		{
			System.out.println("x is " +x);
		}
		
	}


