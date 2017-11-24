package pack1;

import java.util.Scanner;

public class UserInput2 {
	
	public static void main(String[] args)
	{
		String str = "";
		int i =0;
		//int k =0;
		Scanner sc = new Scanner(System.in);
		
		i = sc.nextInt();  // mora nextInt zato sto smo definisali vec da i bude tipa int
		//k = Integer.parseInt(sc.nextLine());
		System.out.println("Resenje " +i);
		//System.out.println("Resenje " +k);

	}

}
