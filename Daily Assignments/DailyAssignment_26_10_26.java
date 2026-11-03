package day5;
class Student33
{
	int rollNumber;
	String name;
	static String collegeName="ABC Engineering College";
	static int studentCount=0;
	Student33(int rollNumber,String name)
	{
		this.rollNumber=rollNumber;
		this.name=name;
		studentCount++;
	}
	static void newcollegeName(String collegeName1)
	{
		collegeName=collegeName1;
		System.out.println("College Name Updated Successfully\n");
	}
	void displayDetails()
	{
		System.out.println("Roll Number:"+rollNumber);
		System.out.println("Name:"+name);
		System.out.println("College Name:"+collegeName);
		System.out.println();
		
	}
	static void displayStudentCount()
	{
		System.out.println("Total Students:"+Student33.studentCount+"\n");
	}
	
}

public class DailyAssignment_26_10_26 {
	static
	{
		System.out.println("Student class is initialized");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student33 student1=new Student33(101,"Rahul");
		student1.displayDetails();
		Student33 student2=new Student33(102,"Priya");
		student2.displayDetails();
		Student33 student3=new Student33(103,"Amit");
		student3.displayDetails();
		Student33.displayStudentCount();
		Student33.collegeName="XYZ Institute of Technology";
		student1.displayDetails();
		student2.displayDetails();
		student3.displayDetails();
		Student33.displayStudentCount();
		
		
	}

}
