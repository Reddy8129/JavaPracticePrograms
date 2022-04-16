import java.util.Scanner;

public class TwoDArray 
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int r= scan.nextInt();
		int c= scan.nextInt();
		int[][] arr = new int[r][c];
		System.out.println("Enter array elements");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println("Array elemets are");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
