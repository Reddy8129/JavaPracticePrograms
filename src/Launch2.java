
public class Launch2 
{
	public static void main(String[] args) 
	{
		Deer d= new Deer();
		Monkey m = new Monkey();
		Tiger t = new Tiger();
		Forest f = new Forest();
		
		f.callAnimal(d);
		System.out.println("******************************************");
		f.callAnimal(m);
		System.out.println("******************************************");
		f.callAnimal(t);
		System.out.println("******************************************");

	}

}
