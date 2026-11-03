package day5;
class Employee
{
	int employeeId;
	String employeeName;
	double salary;
	Employee(int employeeId,String employeeName,double salary)
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.salary=salary;
		
		
	}
	void displayDetails( )
	{
		System.out.println(this.employeeId+":"+this.employeeName+":"+this.salary);
	
	}
	
}

public class DailyAssignment_22_10_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee Employee1=new Employee(101,"Lahithya",50000.0);
		Employee Employee2=new Employee(102,"nani",80000.0);
		Employee1.displayDetails();
		Employee2.displayDetails();
		
		
		
		
		
	}

}
