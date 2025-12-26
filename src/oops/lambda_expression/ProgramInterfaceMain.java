package oops.lambda_expression;


public class ProgramInterfaceMain {

	public static void main(String[] args) {
		ProgramInterface p = () -> System.out.println("Inside Display");
		
		p.display();

	}

}
