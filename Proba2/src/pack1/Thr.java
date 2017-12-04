package pack1;

public class Thr {
	
	public static void main(String[] args)
	{
		Thread th = new Thread();
		th.run();
		
	}

}

class MyThread1 extends Thread {
	
	int[] values = {2,3,4,8,1000};
	public void run(){
		for (int i=0; i<5; i++)
		{
			values[i] = values[i] * 2;
		}
		
	}
}
