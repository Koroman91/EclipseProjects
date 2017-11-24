package pack1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserInput {
	
	
	public static void main(String[] args) throws Exception
	{
	
		System.out.println("Enter the number:");
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(bf.readLine());
		System.out.println(n);

	}
	
	

}
