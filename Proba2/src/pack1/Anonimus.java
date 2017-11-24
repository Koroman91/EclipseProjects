package pack1;

public class Anonimus {
	
	public static void main(String[] args)
	{
		A6 obj = new A6();
		obj.k=26;
		obj.show();   // stampa broj 26 posto mu he dodeljenja vrednost
		new A6().k=20;  // dodeljena vrednost u novoj alociranoj memoriji u heap memoriji
		new A6().show();  // stampa 0, jer novo alociranje u memoriji ne vidi objekat napravljen u heap memory 
		
	}
	

}

class A6 {
	int k;     
	public void show()
	{
		System.out.println(k);
	}
	
}
