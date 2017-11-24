package pack1;

public class LetsSee {

	 public static void main(String [] args)
	 {
		  int i = 5;
		  int b = 8;
		  i = i + 2;
		  System.out.println(i);
		  b *= 2.5;
		  System.out.println(b);
		  
		  
		  int bites = 0b101;
		  System.out.println(bites); // stampa 5
		  
		  // Pre-increment and Post-increment
		  
		  int a = 3;
		  int c;
		  c = ++a;
		  System.out.println(c);
		  
		  // Post- increment
		  
		  c = a++;
		  System.out.println(c + ":" + a);
		  
	
		  int d = 25;
		  int e = 15;
		  int f = d & e;  //and
		  System.out.println(f); // and stampa 9
		  int g = d | e; // or
		  System.out.println(g); // or stampa
		  
		  //Shift u levo i desno
		  
		  int h = 8; // 1000
		  int l = h << 2;  // left shift  100000
		  int m = h >> 2;  // right shift 0010
		  System.out.println(l);
		  System.out.println(m);
		  
	 }
}
