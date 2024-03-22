package pack;

public class ControlFlow {

	public static void main(String[] args) {
		// positive or not
		int a = 40;
		int b = 40;
		int c = 30;

		// single block
		if (a > 100) {
			System.out.println("a is greater than 100");
		} else {
			System.out.println("a is les than 100");

		}
		// nested if block
		if (b > 80) {
			System.out.println("a is greater than 80");
		}
		if (b < 50) {
			System.out.println("b is inside the nested if block");
		}
		// if else if ladder
		if (c > 50) {
			System.out.println("c is greater ");
		} else if (c < 20) {
			System.out.println("c is lesser");
		} else {
			System.out.println("both conditions for c are false");
		}

		System.out.println("End of program execution");
	}
}
