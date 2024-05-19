package sample_test_project;

public class LogicalOperatorsExample {
	
	//And Operator && This returns true if output of both the operands are true
	//OR Operator || This becomes true if any one of the operand is true
	// NOT Operator : ! this inverts the condition


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	boolean value1 = true;
	boolean value2 = false;
	
    System.out.println("AND Operator:"+(value1 && value2));
    System.out.println("OR Operator:"+(value1 || value2));
    System.out.println("NOT Operator:"+(!value1));
	}

}
