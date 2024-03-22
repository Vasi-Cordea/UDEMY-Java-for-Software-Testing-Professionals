package OOP;

public class Calculations_2 {
	int num1; // parameters
	int num2;
	int sum, product;

	  //mwthod 1
	int sum(int num1, int num2) { // function or method
		sum = num1 + num2;
		System.out.println("sum is: " + sum);
		return sum;

	}
      // method 2
	int product(int num1, int num2) {
		product = num1 * num2;
		System.out.println("product is: " + product);
		return product;
	}

	public static void main(String[] args) {
		int result;
		Calculations_2 cal = new Calculations_2(); // object instantiations

		result = cal.sum(10, 25) + cal.product(5, 9);
		System.out.println("result is: " + result);
	}
}
