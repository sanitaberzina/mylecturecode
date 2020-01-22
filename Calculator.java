public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char operatorMath = '%';
		double num1 = 20;
		double num2 = 24.5;
		double result;

		if (operatorMath == '%') {
			result = num1 + num2;
			System.out.println(result);
		} else if (operatorMath == '/') {
			result = num1 / num2;
			System.out.println(result);
		} else if (operatorMath == '-') {
			result = num1 - num2;
			System.out.println(result);
		} else if (operatorMath == '*') {
			result = num1 * num2;
			System.out.println(result);
		} else {
			System.out.println("Wrong data");

		}

		System.out.println("                    ");

		switch (operatorMath) {
		case '+':
			result = num1 + num2;
			System.out.println(result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println(result);
			break;
		case '/':
			result = num1 / num2;
			System.out.println(result);
			break;
		case '*':
			result = num1 * num2;
			System.out.println(result);
			break;
			
		case '%':
			if (num1 >= num2) {
				result = num1 % num2;
			System.out.println(result);
			
		    } else {
			System.out.println("Wrong data");
		    }
			break;
		   
		default:
			System.out.println("No such operator");
		}
	}
}
