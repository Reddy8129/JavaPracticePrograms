import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range:");
		int n = scan.nextInt();
		int num1 = 0;
		int num2 = 1;
		int num3;
		System.out.println(num2);
		for (int i = 0; i < n; i++) {
			num3 = num1 + num2;
			System.out.println(num3);
			num1 = num2;
			num2 = num3;
		}

	}

}
