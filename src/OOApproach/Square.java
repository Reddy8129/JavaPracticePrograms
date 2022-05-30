package OOApproach;

import java.util.Scanner;

public class Square extends Shape
{
	float length;
	void acceptInput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of square");
		length= sc.nextFloat();
	}
	void calculate(){
		area= length*length;
	}
}
