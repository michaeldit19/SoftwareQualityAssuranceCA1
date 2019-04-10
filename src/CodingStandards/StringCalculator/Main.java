package CodingStandards.StringCalculator;

public class Main {

	public static void main(String[] args) {
		StringCalculator c1 = new StringCalculator();
		StringCalculator c2 = new StringCalculator();

		c1.name = "Calculator1";
		c2.name = "Calculator2";

		System.out.println(c1.name + " calculated " + c1.addNumbers(5, 8));
		System.out.println(c2.name + " calculated " + c1.subtractNumbers(32, 11));

	}

}
