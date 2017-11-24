package pack1;

public class Sup {
	
	public static void main(String[] args)
	{
		B4 obj = new B4();
		obj.show();
		//obj.show1();
	}

}

class A4{
	
	
	
	int i=5;
	public void show1()
	{
	System.out.printf("Number is %d",i);
	}
}

class B4 extends A4{
	
	int i=4;
	
	public void show()
	{
		System.out.println(i);
	}
	
}