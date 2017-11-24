package pack1;

public class Ths2 {
	
	public static void main(String[] args)
	{
		A91 obj = new A91(2,3);
		obj.show();
	}

}

 class A91{
	
	private int a; 
	private int b; 
	int d = 0;
	 
	public A91(int a, int b){
		
		this.a = a;
		this.b = b;
	}
	
	public void show()
	{
		d=a+b;
		System.out.println("Zbir brojeva " +a+ " i " +b+ " je: " + d);
	}
		
	
	
	
}
