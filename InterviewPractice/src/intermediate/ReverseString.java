package intermediate;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println(reverseString("Puspa"));
	}
	
	static String reverseString(final String str) {
		
		final StringBuilder sb = new StringBuilder();
		char[] strArray = str.toCharArray();
		for(int i = strArray.length-1;i>=0;i--) {
			sb.append(strArray[i]);
		}
		
		//without using array
//		for(int i = str.length()-1;i >= 0; i--) {
//			sb.append(str.charAt(i));
//		}
		
		//using java builtin reverse() method
		
		
		return sb.toString();
	}

}
