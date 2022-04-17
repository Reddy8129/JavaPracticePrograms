
public class StaticDemonstration {
	public static void main(String[] args) 
	{
		CollegeMgmt.dispClgDetails();
		CollegeMgmt s1= new CollegeMgmt("Prahanth", 18, "MCA", 23, "6360132826");
		s1.dispStudentDetails();
		CollegeMgmt s2= new CollegeMgmt("Ashok", 16, "BCA", 22, "7996633122");
		s2.dispStudentDetails();
		CollegeMgmt s3= new CollegeMgmt("Ambareesh", 19, "MBA", 24, "9663307390");
		s3.dispStudentDetails();
	}

}
