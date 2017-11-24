package pack1;

public class DemoToString {
	
	public static void main(String[] args)
	{
	   Student s1 = new Student(26, "Stefan");	
	   //System.out.println(s1.rollno);
	   //System.out.println(s1.sname);
	   //System.out.println(s1); stampa paket, klasu i hashcode objekta, zato je potrebno definisti toString
	   System.out.println(s1);
	}

}

class Student
{
	int rollno;
	String sname;
	


	public Student(int rollno, String sname) {
		//super();
		this.rollno = rollno;
		this.sname = sname;
	}


	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + "]";
	}
	
	
	
}
