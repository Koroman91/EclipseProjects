package pack1;

import java.util.ArrayList;

public class Collections {
	
	public static void main(String[] args) throws Exception
	{
		ArrayList<Integer> value = new ArrayList<Integer>();
		
		value.add(5);  // dodaje 5 na listu index 0
		value.add(3);  // dodaje 3 na listu index 1
		value.add(2);   // dodaje 2 na listu index 2
		value.remove(0); // obrisace broj 5 jer se nalazi na indexu 0
		
		System.out.println(value);
		
		
		
		
	}

}
