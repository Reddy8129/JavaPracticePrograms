import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		if (isPalindrome(num))
			System.out.println(num + " is a palindrome");
		else
			System.out.println(num + " is not a palindrome");
	}
	
	public static boolean isPalindrome(int num)
	{
		int rev=0;
		int count=num;
		while(count>0)
		{
			rev=rev*10+(count%10);
			count/=10;
		}
		if(rev==num)
			return true;
		return false;
	}

}
