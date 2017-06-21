import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String operator = "";
		double total = 0;
		
		try {
				System.out.printf("Enter the 1st number: ");
				Double firstOperand = readNumber(scan);
			
				System.out.printf("Enter operator: ");
				operator = readOperator(scan);
				
				System.out.printf("Enter the 2nd number: ");
				Double secondOperand = readNumber(scan);			

				switch (operator) {
				case "+":
					total = firstOperand + secondOperand;
					break;
				case "-":
					total = firstOperand - secondOperand;
					break;
				case "*":
					total = firstOperand * secondOperand;
					break;
				case "/":
					total = firstOperand / secondOperand;
					break;
				default:
					System.out.println("Invalid operator!");
				}
				System.out.println("Your result is: " + total);
	
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
			System.out.println("Invalid operand!");
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
			scan.reset();
		}
		return result;
	}
}