package OOApproach;

import java.util.Scanner;

public class Circle extends Shape
{

	float radious;
	void acceptInput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radious of circle");
		radious= sc.nextFloat();
	}
	void calculate(){
		area= 3.14F*(radious*radious);
	}
}
