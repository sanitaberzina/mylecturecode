public class ArraysPrimitiveDataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrays;
		arrays = new int[2];

		int[] arrTest = new int[5];
		arrTest[0] = 10;
		arrTest[1] = 3;
		arrTest[4] = 4;

		System.out.println(arrTest[0] + " " + arrTest[1]);

		System.out.println("_____________________________________________");

		double[] doubleArray = new double[3];
		doubleArray[0] = 0.5;
		doubleArray[1] = 1.8;
		doubleArray[2] = 0.2;

		System.out.println(doubleArray[0] + "  " + doubleArray[1] + "  "
				+ doubleArray[2]);

		char[] charArray = new char[2];
		charArray[0] = 'c';
		charArray[1] = 'f';

		System.out.println(charArray[0] + "  " + charArray[1]);

		boolean[] booleanArray = new boolean[2];
		booleanArray[0] = true;
		booleanArray[1] = false;

		System.out.println(booleanArray[0] + "  " + booleanArray[1]);

		int checkLength = arrTest.length;
		int checkLength2 = booleanArray.length;

		System.out.println("Array length is " + checkLength2);
		
		System.out.println(booleanArray[booleanArray.length-1]);
	}

}
