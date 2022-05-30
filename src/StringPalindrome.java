import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.next();
		String reverse = reverse(str);
//		for (char c : str.toCharArray()) {
//			reverse = c + reverse;
//		}
		if (str.equals(reverse))
			System.out.println(str + " is a palindrome");
		else
			System.out.println(str + " is not a palindrome");
	}
	public static String reverse(String input)
	{
		if(input==null||input.isEmpty())
		{
			return input;
		}
		
		return input.charAt(input.length()-1)+
				reverse(input.substring(0,input.length()-1));
	}
}
