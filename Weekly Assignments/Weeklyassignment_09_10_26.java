package day2;

public class Weeklyassignment_09_10_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 4.print common elements in arrays
		int [] array1 = {10,20,30,40,50};
		int[] array2 = {30,40,60,70,50};
		System.out.print("Common elements:");
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array2.length;j++)
				if(array1[i]==array2[j])
					System.out.print(array1[i]+" ");					
		}
		System.out.println();
		//3.find the missing number in an array
		int [] array3 = {1,2,3,5,6,7,8,9,10};
		int n =array3.length+1;
		int excepectedsum = n*(n+1)/2;
		int actualsum=0;
		System.out.print("Missing number:");
		for(int i=0;i<array3.length;i++)
		{
			actualsum = actualsum+array3[i];
		}
		if(excepectedsum!=actualsum)
			System.out.println(excepectedsum-actualsum);
		
		
		
		//2.move all zeros to the end
		int arr[]= {0,5,0,3,8,0,2,9};
		int index =0;
		System.out.println("move all zeros to the end:");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[index]=arr[i];
				System.out.print(arr[index]+" ");
			}
			index++;
				
			
		}
		
		for(index=0;index<arr.length;index++)
			if(arr[index]==0)
			{
				System.out.print(arr[index]+" ");
			}
		System.out.println();

		
		//positive and negative numbers separation
		
		int []array5 = {-4,7,0,-2,9,0,-8,5};
		System.out.println("Separeted positive and negative numbers:");
		for(int i=0;i<array5.length;i++)
		{
			if(array5[i]>0)
			{
				System.out.print(array5[i]+" ");
			}					
		}
		for(int i=0;i<array5.length;i++)
		{
			if(array5[i]<0)
			{
				System.out.print(array5[i]+" ");
			}					
		}
		for(int i=0;i<array5.length;i++)
		{
			if(array5[i]==0)
			{
				System.out.print(array5[i]+" ");
			}					
		}
		System.out.println();
		
		//1.Second largest number
		int arr1[]= {12,45,7,89,34,89,56};
		int max=arr1[0];
		int value=arr1[0];
		int secondmax=0;
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i]>max)
				max=arr1[i];
		}
		System.out.println(max);
		for(int j=0;j<arr1.length;j++)
		{ 
			if((arr1[j]!=max) && (arr1[j]>=value))
			{
				value = arr1[j];
				if(value>secondmax) 
				{
					secondmax = value;
					
				}
			}
//			System.out.println(value);
		}
		System.out.print("Secondlargest number: "+secondmax);
		
		
		
		
	}

}
