package intermediate;
//Test if the word is a palindrome
public class PalindromeCheck {

	public static void main(String[] args) {
		String str = "bal lab";
		System.out.println(isWordPalindrome(str));
	}
	
	public static boolean isWordPalindrome(String str) {
		if(str.equals(reverseString(str))) {
			return true;
		}
		return false;
		
	}
	static String reverseString(final String str) {
		
		final StringBuilder sb = new StringBuilder();
		char[] strArray = str.toCharArray();
		for(int i = strArray.length-1;i>=0;i--) {
			sb.append(strArray[i]);
		}

		return sb.toString();
	}

}
