package Hackerearth;

import java.util.Scanner;

class Rotaion
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of array: ");
		int n=scan.nextInt();
		System.out.println("Enter number of steps of rotation: ");
		int k=scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter element for index: "+i);
			arr[i]=scan.nextInt();
		}
		System.out.println("Array before rotation");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Array after rotation");
		int t=k%n;
		for(int i=t-1;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<t-1;i++){
			System.out.print(arr[i]+" ");
		}
//		for (int i = 0; i < arr.length; i++) {
//			if(t<1){
//				resultArr[i]=arr[i-(k%n)];
//			}
//			else{
//				resultArr[i]=arr[n-t];
//				t--;
//			}
//		}
//		System.out.println("Array after rotation");
//		for(int i = 0; i < arr.length; i++) {
//			System.out.print(resultArr[i]+" ");
//		}
	}
}