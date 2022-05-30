package OOApproach;

public class Launch {

	public static void main(String[] args) 
	{
		Square sq= new Square();
		Rectangle rc=new Rectangle();
		Circle cl= new Circle();
		calc(sq);
		calc(rc);
		calc(cl);
	}
	static void calc(Shape ref)
	{
		ref.acceptInput();
		ref.calculate();
		ref.display();
	}
}
