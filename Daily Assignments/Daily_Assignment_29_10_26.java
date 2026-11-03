package day5;

public class Daily_Assignment_29_10_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char beta='7';
		char beta1='A';
		if(Character.isDigit(beta))
			System.out.println("Digit");
		else
			System.out.println("Not Digit");
		if(Character.isLetter(beta1))
			System.out.println("Letter");
		else
			System.out.println("not letter");
		char beta2='b';
		char beta3=Character.toUpperCase(beta2);
		System.out.println(beta3);
	}

}
