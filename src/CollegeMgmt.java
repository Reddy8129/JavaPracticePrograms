public class CollegeMgmt {
	static int studentCount;
	static String clgName;
	static String clgLoc;
	static
	{
		studentCount=0;
		clgName="BMSIT";
		clgLoc="Avalahalli, Bangalore";
	}
	static void dispClgDetails()
	{
		System.out.println("############# "+clgName+" #############");
		System.out.println("***** "+clgLoc+" *****");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println();
	}
	
	String sName,courseName,sId,phno;
	int age;
	{
		++studentCount;
		System.out.println("Total Students count "+studentCount);
	}
	public CollegeMgmt(String sName, int batch,String courseName,int age,String phno)
	{
		this.sName=sName;
		this.sId=clgName+batch+courseName+studentCount;
		this.courseName=courseName;
		this.age=age;
		this.phno=phno;
	}
	
	void dispStudentDetails()
	{
		System.out.println("Student USN: "+sId);
		System.out.println("Student Name: "+sName);
		System.out.println("Course taken: "+courseName);
		System.out.println("Student age: "+age);
		System.out.println("Student phone no: "+phno);
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------------------");
	}
}
