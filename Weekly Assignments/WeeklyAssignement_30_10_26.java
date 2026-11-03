package day5;

public class WeeklyAssignement_30_10_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.total number of vowels and consonants in a given string
		String input="Programming";
		int lengthofword=input.length();
		int vowels=0;
		int Consonantscount=0;
		char arr[]= {'a','e','i','o','u'};
		for(int i=0;i<=input.length()-1;i++)
		{
			//a,e,i,o,u
			for(int j=0;j<=arr.length-1;j++)
			{
				if(input.charAt(i)==arr[j])
				{
					vowels++;
				}
				
			}
		}
		System.out.println("vowels:"+vowels);
		Consonantscount=lengthofword-vowels;
		System.out.println("Consonants:"+Consonantscount);
		
		
		//2.find the longest word
		String input2="Java programming is interesting";
		String []word=input2.split(" ");
		String temp="";
		for(int k=0;k<=word.length-1;k++)
			{
				int length1=word[k].length();
				System.out.println(length1);
				
				if(temp.length()>=length1)
				{
					
				}
				else
					temp=word[k];
			}
		System.out.println(temp);
		
		
		//3.Replace a character in a string
		String data ="banana";
		char oldcharc='a';
		char newcharc='o';
		for(int g=0;g<=data.length()-1;g++)
		{
			if(data.charAt(g)==oldcharc)
			{
				String newdata=newcharc+"";
				System.out.print(newdata);
			}
			else
				System.out.print(data.charAt(g));
		}
		System.out.println();
		
		
		//4.all possible non-empty substrings
		String input9="ABC";
		for(int a=0;a<=input9.length()-1;a++)
		{
			for(int b=a+1;b<=input9.length();b++)
			{
		
				System.out.println(input9.substring(a,b));
				
			}
		}
		
		
	}

}
