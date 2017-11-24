package pack1;

public class StringDemo {
	
	public static void main(String[] args)
	{
		String str = "Stefan , Milos , Nikola , Petar";  // deklaracija stringa
		
		String names[] = str.split(",");  //dodela nizu i odsecanje elementa ","
		
		System.out.println(names[0]);  // stampa element sa idnexom 0
		
		
		
		//stampa svih elemenata
		for (String name : names)    
		{
			System.out.println(name);
		}
		
		
	}

}
