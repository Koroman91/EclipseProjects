package pack1;


interface Abc3{
	
	void show();
}



/*class AbcImpl implements Abc3 {
	
	
	public void show()
	{
		System.out.println("in show");
	}
}*/





public class Inter {
	
	
	public static void main(String []args)
	{
		Abc3 obj = () -> System.out.println("in show");
		obj.show();
	}

}
