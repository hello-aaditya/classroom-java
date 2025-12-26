package dsa.string;


public class UniqueString {

	public static void main(String[] args) {
		String str = "aabbccde";
		int size = str.length();
		
		int max = 0;
		String uniqueStr = "";
		
		for(int i=0; i<size; i++) {
			for(int j=i; j<size; j++) {
				char currentChar = str.charAt(j);
				
				if(uniqueStr.indexOf(currentChar) != -1) {
					break;
				}
				
				uniqueStr = uniqueStr + currentChar;
				if(uniqueStr.length() > max) {
					max = uniqueStr.length();
				}
			}
		}
		System.out.println(uniqueStr);
		System.out.println(max);

	}

}
