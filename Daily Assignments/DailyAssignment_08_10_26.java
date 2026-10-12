package day2;

public class DailyAssignment_08_10_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice=4;
		int a=20;
		int b=5;
		do
		{
		switch(choice)
		{
		case 1:System.out.print("Addition ="+(a+b));break;
		case 2:System.out.println("Subraction ="+(a-b));break;
		case 3:System.out.println("Multiplication ="+(a*b));break;
		case 4:System.out.println("Division ="+(a/b));break;
		case 5:System.out.println("Exit");
		}
		choice++;
		break;
		}while(choice<=5);
		
		//skip even numbers using do while loop
		
		int num=0;
		do
		{
			num++;
			if(num%2==0)
				continue;
			else if(num>15)
				break;
			System.out.println(num);
		}while(num<=20);
	}

}
