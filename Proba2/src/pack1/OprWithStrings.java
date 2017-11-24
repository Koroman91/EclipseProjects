package pack1;

import java.util.Scanner;

public class OprWithStrings {
	
	public static void main(String[] args)
	{
		String s1,s2;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter two strings: ");
		s1 = scn.nextLine();
		s2 = scn.nextLine();
		
		String s3 = s1.concat(s2);
		System.out.println("Result on Concatenation is : " +s3);
		
		int l1 = s1.length();
		int l2 = s2.length();
		System.out.println("String 1 length is : " +l1);
		System.out.println("String 2 length is : " +l2);
		
		
		String s4 = s1.toUpperCase();
		System.out.println("Uppercase of String 1 is : " +s4);
		String s5 = s2.toUpperCase();
		String s6 = s4+s5;
		System.out.println("Uppercase of String 1 and String 2 is : " +s6);
	}

}
