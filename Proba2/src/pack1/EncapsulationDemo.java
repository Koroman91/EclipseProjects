package pack1;

public class EncapsulationDemo {
	
	public static void main(String[] args)
	{
		Emp e1 = new Emp();
		e1.setEmpId(3);
		e1.setEmpName("Navin");
		Emp e2 = new Emp();
		e2.setEmpId(5);
		e2.setEmpName("Rizvan");
		
		System.out.println(e1.getEmpId());

	}
	}

class Emp {
	
	private int empId;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	private String empName;
	
}
