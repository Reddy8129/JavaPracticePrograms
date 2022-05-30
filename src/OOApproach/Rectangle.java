package OOApproach;

import java.util.Scanner;

public class Rectangle extends Shape
{
	float length;
	float breadth;
	void acceptInput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of rectangel");
		length= sc.nextFloat();
		System.out.println("Enter the breadth of rectanble");
		breadth= sc.nextFloat();
	}
	void calculate(){
		area= length*breadth;
	}
}
