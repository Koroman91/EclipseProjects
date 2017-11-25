package pack1;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DemoException2 {
	
	public static void main(String[] args) throws Exception
	{

		
		
		try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)))
		{
		String str = "";
		str = bf.readLine();

	}
}
}
