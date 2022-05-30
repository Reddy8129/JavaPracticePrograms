import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :");
		long num= sc.nextInt();
		if(isPrime(num))
			System.out.println(num+" is a prime number");
		else System.out.println(num+ " is not a prime");
	}
	
	public static boolean isPrime(long num)
	{
		long sqrt = (long) Math.sqrt(num)+1;
		for(int i=2;i<=sqrt;i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
}
