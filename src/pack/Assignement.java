package pack;

public class Assignement {

	public static void main(String[] args) {
		
		int num1;
		num1 = 2; // Assignment operator
		System.out.println(num1);
		int num2 = 4; //initialization
		System.out.println("Before Addition " + num2);
		//num2 = num2 + num1; 
		//the above more simple:
		num2+=num1;
		System.out.println("After Addition " + num2);
		
		System.out.println("Before Multiplication " + num2);
		num2*=num1;
		System.out.println("After Multiplication " + num2);
		
		System.out.println("Before Subtraction " + num2);
		num2-=num1;
		System.out.println("After Subtraction " + num2);
		
		
		System.out.println("Before Division " + num2);
		num2/=num1;
		System.out.println("After Division " + num2);

	}
}