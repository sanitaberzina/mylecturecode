
public class ControlFlowIf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int x = 10;
      int y = 22;
      
      if(x>y){
    	System.out.println("X < Y");
      }

	
	int numberCheck = 20;
	if(numberCheck % 2 == 0){
		System.out.println(numberCheck + "  is even");
	}else{
		System.out.println(numberCheck + " is odd");
	}

// CheckPassFail
	int mark = 77;
			if(mark > 50){
				System.out.println("PASS");
			}else{
				System.out.println( "FAIL");
			}
			
				System.out.println("DONE");
			
}
	
}