
public class OperatorsMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double num1 = 0.4;
        double num2 = 0.20;
        double result;
        double result1;
        double result2;
        double result3;

        char add = '+';
        char sub = '-';
        char mult = '*';
        char divi = '/';
        
        
        result = num1 + num2;
        result1 = num1 - num2;
        result2 = num1 * num2;
        result3 = num1 / num2;
        
        
        System.out.println(num1 + " "+ add+ " "+num2+" = "+result);
        System.out.println();
        System.out.println(num1 + " "+ sub+ " "+num2+" = "+result1);
        System.out.println();
        System.out.println(num1 + " "+ mult+ " "+num2+" = "+result2);
        System.out.println();
        System.out.println(num1 + " "+ divi+ " "+num2+" = "+result);
        System.out.println();

        int a = 10;
        int b = 3;
        int x = a % b;
        		
        		System.out.println("x = "+x);
        		
        int i = 1;
        i++;
        System.out.println(i);
        
        int k = 2;
        // return increment result
        int p = ++k;
        		
        		System.out.println("p after increment: "+p);
        		
    

	}

}
