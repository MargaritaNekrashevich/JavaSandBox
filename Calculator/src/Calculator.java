import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String operator = "";
		try {

			do {
				System.out.println("Enter first number \n");
				Double a = readNumber(scan);
				if (a == null) {
					continue;
				}
				System.out.println("Enter operator \n");
				operator = readOperator(scan);
				if (operator == null) {
					continue;
				}
				System.out.println("Enter second number \n");
				Double b = readNumber(scan);
				if (b == null) {
					continue;
				}
				double c = 0;

				switch (operator) {
				case "+":
					c = a + b;
					break;
				case "-":
					c = a - b;
					break;
				case "*":
					c = a * b;
					break;
				case "/":
					c = a / b;
					break;
				default:
					System.out.println("Invalid operator!!!");
				}
				System.out.println(c);
			} while (!operator.equals("q"));
		} catch (Throwable e) {
			System.out.println("Error: " + e.getMessage());

		} finally {
			scan.close();
		}

	}

	private static Double readNumber(Scanner scan) {
		Double result = null;
		try {
			result = scan.nextDouble();
		} catch (Throwable e) {
			System.out.println("Invalid number!");
			scan.reset();
		}
		return result;
	}

	private static String readOperator(Scanner scan) {
		String result = null;
		try {
			result = scan.next();
		} catch (Throwable e) {
			System.out.println("Invalid operator!");
		}
		return result;
	}
}