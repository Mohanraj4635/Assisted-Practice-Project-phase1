package constrcutors;

public class constrctor {
	int empId;
	String empName;
	String role;
	float salary;
	
	public constrctor() {
		empId=10;
		empName="Emp200";
		role="software engineer";
		salary=28000;
	}
	
	public constrctor(int empId,String empName,String role,float salary) {
		this.empId=empId;
		this.empName=empName;
		this.role=role;
		this.salary=salary;
	}
	
	public void display() {
		System.out.println("Id: "+empId);
		System.out.println("Name: "+empName);
		System.out.println("role: "+role);
		System.out.println("Salary: "+salary);
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		
		constrctor e= new constrctor();
		constrctor e1= new constrctor(7, "kalai", "software enginner", 28000); 

		e.display();
		e1.display();
		
		 
	
	}

	
}
