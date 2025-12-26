package dsa.string;



import java.util.Scanner;
public class DotAppend {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		String str = "Java";
		
		// str.append(); error: 'String' is immutable
		
		StringBuilder sb = new StringBuilder();
		
		System.out.println("Enter first words: ");
		String str1 = input.next();
		
		System.out.println("Enter second words: ");
		String str2 = input.next();
		
		System.out.println("Enter third words: ");
		String str3 = input.next();
		
		sb.append(str1);
		System.out.println(sb);
		
		sb.append(str2);
		System.out.println(sb);
		
		sb.append(str3);
		System.out.println(sb);
		
		System.out.println(str.contains("Ko"));
		
		input.close();

	}

}
