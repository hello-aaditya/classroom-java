package dsa.string;


import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string: ");;
		String str = input.nextLine();
		
		char ch[] = str.toCharArray();
		
		int size = ch.length;
		char reverseCh[] = new char[size];
		
		int start = 0;
		int end = size-1;
		
		while(start <= end) {
			reverseCh[start] = ch[end];
			System.out.println(reverseCh[start]);
			start++;
			end--;
		}
		
		for(int i=0; i<size; i++) {
			System.out.print(reverseCh[i]);
		}
		
		input.close();
	}

}
