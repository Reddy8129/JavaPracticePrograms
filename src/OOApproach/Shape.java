package OOApproach;

abstract public class Shape 
{
	float area;
	abstract void acceptInput();
	abstract void calculate();
	final void display()
	{
		System.out.println(area);
	}
}
