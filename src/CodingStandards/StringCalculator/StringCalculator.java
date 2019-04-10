//Package name in line with project name, displaying actively what package intends to do
package CodingStandards.StringCalculator;

//Class name starting with capital letter and each word after it starting with a capital letter as well
public class StringCalculator {

	// variable name begins with small letter
	String name;

	// getter:takes no arguments, prefixed with get, public method
	public String getName() {
		return name;
	}

	// setter:returns void, prefixed with set, public method, takes an argument
	public void setName(String name) {
		this.name = name;
	}

	// method names: first word begins with small letter, second begins with
	// capital
	public int addNumbers(int x, int y) {
		return x + y;
	}

	public int subtractNumbers(int x, int y) {
		return x - y;
	}

	public int mulitplyNumbers(int x, int y) {
		return x * y;
	}

	public int divideNumbers(int x, int y) {
		return x / y;
	}

}
