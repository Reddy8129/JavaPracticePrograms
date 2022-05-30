import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numbe");
		int num = sc.nextInt();
		int sum =0,dig;
		int tnum=num;
		while(tnum>0)
		{
			dig=tnum%10;
			sum+=dig*dig*dig;
			tnum/=10;
		}
		if(num==sum)
			System.out.println(num+" is Amstrong");
		else
			System.out.println(num+ " is not a Amstrong");
	}

}
