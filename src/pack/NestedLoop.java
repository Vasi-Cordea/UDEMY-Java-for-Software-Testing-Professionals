package pack;

public class NestedLoop {

	public static void main(String[] args) {
		
		// Nested loop
		for (int i = 0; i <=10; i++) {
			System.out.println("Outer loop: " + i);
			
			// inner loop
			// for i==4 do not print,
			for(int j=0; j<=5; j++) {
				System.out.println("Inner Loop:"+j);
			}
			

	}
	}

}