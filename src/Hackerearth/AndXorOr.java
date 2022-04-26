package Hackerearth;

import java.util.Scanner;

public class AndXorOr {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t= s.nextInt();
		while(t!=0)
		{
			int n= s.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i]=s.nextInt();
			}
			int min=(a[0]^a[1]);
			for(int i=1;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					int result=(a[i]^a[j]);
					if(result<min)
						min=result;
				}
			}
			System.out.println(min);
			t--;
		}
	}
}
