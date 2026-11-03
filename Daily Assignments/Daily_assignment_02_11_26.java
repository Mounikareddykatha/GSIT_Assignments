package Day7;
abstract class Employee21
{
	int employeeId;
	String employeeName;
	abstract void calculateSalary();
	Employee21(int employeeId,String employeeName)
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
	}
	void displayDetails()
	{
		System.out.println("EmployeeId "+employeeId);
		System.out.println("Employee Name "+employeeName);
	}

}
class FullTimeEmployee1 extends Employee21
{
	FullTimeEmployee1(int employeeId,String employeeName,int fixed_monthlySalary)
	{
		super(employeeId,employeeName);
		System.out.println("Full Time Employee Details");
	}
	int fixed_monthlySalary;
	void calculateSalary()
	{
		this.fixed_monthlySalary=50000;
		System.out.println("Monthly Salary "+fixed_monthlySalary);
		System.out.println();
	}
	

}
class PartTimeEmployee1 extends Employee21
{
	PartTimeEmployee1(int employeeId,String employeeName,int hoursWorked,int hourlyRate)
	{
		super(employeeId,employeeName);
		this.hoursWorked=hoursWorked;
		this.hourlyRate=hourlyRate;
		System.out.println("Part Time Employee Details");
		
	}
	int hoursWorked;
	int hourlyRate;
	void calculateSalary()
	{
		int salary=hoursWorked*hourlyRate;
		System.out.println("Hourly Worked "+hoursWorked);
		System.out.println("Hourly Rate "+hourlyRate);
		System.out.println("Caculated Salary "+salary);
		
	}
	

}
public class Daily_assignment_02_11_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FullTimeEmployee1 E1 =new FullTimeEmployee1(101,"Rahul",50000);
		E1.displayDetails();
		E1.calculateSalary();
		PartTimeEmployee1 E2=new PartTimeEmployee1(102,"Amit",80,300);
		E2.displayDetails();
		E2.calculateSalary();
		
	}

}
