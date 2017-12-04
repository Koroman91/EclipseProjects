package pack1;

import java.sql.*;

class Hi extends Thread{
	
	public void run(){
	for (int i=1; i<=5; i++)
	{
		System.out.println("Hi");
		try {Thread.sleep(500);}
		catch(Exception e){}
	}
  }
}

class Hello extends Thread{
  public void run()
  
{
	for (int i=1; i<=5; i++)
	{
		System.out.println("Hello");
		try {Thread.sleep(500);}
		catch(Exception e){}
	}
}
	
}

public class Thr2 {
	
	public static void main(String [] args)
	{
		Hi th = new Hi();
		th.start();
		Hello th2 = new Hello();
		th2.start();
	}

}
