package day2;

public class DailyAssignment_06_10_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//inverted right angled triangle
//		for(int row=1;row<=5;row++)
//		{
//			for(int star=1;star<=6-row;star++)
//				System.out.print("*");
//			System.out.println();
//		}
		//increasing number triangle
//		for(int row=1;row<=5;row++)
//		{
//			for(int n=1;n<=row;n++)
//			{
//				System.out.print(n);
//			}
//			System.out.println();
//		}
		
		//Repeated number triangle
		for(int row=1;row<=5;row++)
		{
			for(int n=1;n<=row;n++)
			{
				if(row==n)
					for(int j=1;j<=row;j++)
						System.out.print(n);
			}
			System.out.println();
		}
		
		//Butterfly pattern
//		for(int row=1;row<=5;row++)
//		{
//			for(int star=1;star<=row;star++)
//				System.out.print("*");
//			for(int sp=1;sp<=10-2*row;sp++)
//				System.out.print(" ");
//			for(int star=1;star<=row;star++)
//				System.out.print("*");
//			System.out.println();
//		}
//		for(int row=1;row<=4;row++)
//		{
//			for(int star=1;star<=5-row;star++)
//				System.out.print("*");
//			for(int sp=1;sp<=2*row;sp++)
//				System.out.print(" ");
//			for(int star=1;star<=5-row;star++)
//				System.out.print("*");
//			System.out.println();
//		}
		
		
		
	}

}
