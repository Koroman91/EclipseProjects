
package pack1;

public class MarkInter {
	
	public static void main(String[] args)
	{
	 Dem obj = new Dem();
	 if (obj instanceof M)
	 {
		 obj.show();
	 }
	 else
	 {
		 System.out.println("Error!");
	 }
		
		
	}

}

interface M {
	
}

class Dem implements M {
	void show()
	{
		
			System.out.println("Hello M");
		
	}
}