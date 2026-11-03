package day5;

import java.util.*;

public class DailyAssignment_27_10_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc1.nextInt();
		int arr[]=new int[size];
		int sum=0;
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter element "+(i+1));
			arr[i]=sc1.nextInt();
			sum = arr[i]+sum;
		}
		System.out.println("Sum:"+sum);
		sc1.close();
		
	}

}
