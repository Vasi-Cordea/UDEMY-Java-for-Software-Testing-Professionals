package pack;

public class SwitchCase {

	public static void main(String[] args) {
		int num = 3;

		switch (num + 1) {
		case 2:
			System.out.println("case 2");
			break;
		case 3:
			System.out.println("case 3");
			break;
		case 4:
			System.out.println("case 4");
			break;
		default:
			System.out.println("default");
			break;

		}
		// example 2
		String name  = "Olivia";

		switch (name) {
		case "Tom":
			System.out.println("Tom is taller");
			break;
		case "Frank":
			System.out.println("Frank is older");
			break;
		case "Olivia":
			System.out.println("Olivia is pretty");
			break;
		default:
			System.out.println("No names found matching");
			break;
	}
		System.out.println("out of case statement");
}
}