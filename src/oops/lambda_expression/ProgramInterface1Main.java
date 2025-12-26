package oops.lambda_expression;


public class ProgramInterface1Main {

	public static void main(String[] args) {
		ProgramInterface1 p = (a, b) -> {
			return a+b;
		};
		
		System.out.println(p.addition(5, -5));
	}

}
