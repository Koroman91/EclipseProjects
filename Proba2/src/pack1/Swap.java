package pack1;

public class Swap {
	
	public static void main(String[] args)
	{
		int a = 5;
		int b = 4;
		
		// xor -> ^
		// xor gate 
		// 1 1 -> 0
		// 1 0 -> 1
		// 0 1 -> 1
		// 0 0 -> 0
		
		
		a = a^b;  // 1 0 1 xor 1 0 0 ->  0 0 1
		b = a^b;  // 0 0 1 xor 1 0 0  -> 1 0 1 -> 5
		a = a^b;  // 0 0 1 xor 1 0 1  -> 1 0 0 -> 4
		
		System.out.println("Number a: "  +a);
		System.out.println("Number b: "  +b);
		
		
		
	}

}
