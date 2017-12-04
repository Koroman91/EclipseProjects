package pack1;

public class Cloning {
	
	public static void main(String [] args)
	{
		Abc2 obj = new Abc2();
		obj.i = 5;
		obj.j = 6;
		
		Abc2 obj1 = new Abc2();
		
		obj1.i = obj.i;
		obj1.j = obj.j;
		obj1.j = 8;
		System.out.println(obj1);
		System.out.println(obj);
		
	}

}

class Abc2 {
	
	int i, j;
	
	@Override
	public String toString(){
		return "ABC{" + "i = " +i + ", j = " + j + "}";
	}
	
}
