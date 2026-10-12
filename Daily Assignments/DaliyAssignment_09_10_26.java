package day2;

public class DaliyAssignment_09_10_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//count of even and odd numbers
		int []array= {11,24,35,42,56,67,80,93};
		int evencount=0;
		int oddcount=0;
		for(int index=0;index<array.length;index++)
			if(array[index]%2==0)
				evencount++;
			else
				oddcount++;
		System.out.println("Even number:"+evencount);
		System.out.println("Odd numbers:"+oddcount);
		
		//Duplicate elements
		int [] array2 = {10,20,30,20,40,10,50,30,60};
		System.out.print("Duplicate elements:");
		for(int dup=0;dup<array2.length;dup++)
		{
			for(int j=dup+1;j<array2.length;j++)
				if(array2[dup]==array2[j])
					System.out.print(array2[dup]+" ");			
				
		}
		
		
				
		
	}

}
