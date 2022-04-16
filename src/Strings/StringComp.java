package Strings;

class StringComp
{
	public static void main(String[] args) {
		String s1= "PRASHANTH";
		String s2= "PRASHANTH";
		
		String s3= new String("PRASHANTH");
		String s4= new String("PRASHANTH");
		
		System.out.println("******************* Comparing S1 and S2 **************************");
		if(s1==s2)System.out.println("References are equal");
		else System.out.println("References are not equal");
		
		if(s1.equals(s2))System.out.println("Values are Equal");
		else System.out.println("Values are not equal");

		System.out.println("******************* Comparing S3 and S4 **************************");

		if(s3==s4) System.out.println("References are equal");
		else System.out.println("References are not equal");
		
		if(s3.equals(s4))System.out.println("Values are Equal");
		else System.out.println("Values are not equal");
		
		System.out.println("******************* Comparing S1 and S3 **************************");

		if(s1==s3) System.out.println("References are equal");
		else System.out.println("References are not equal");
		
		if(s1.equals(s3))System.out.println("Values are Equal");
		else System.out.println("Values are not equal");
		
	}
}