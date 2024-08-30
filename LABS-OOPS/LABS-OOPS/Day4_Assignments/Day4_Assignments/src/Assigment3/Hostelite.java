package Assigment3;

public class Hostelite extends Student{
	private String hostelname;
	private int roomnumber;
	
		public Hostelite(int studentid, String firstname, String lastname, char stype,double feespermonth , String hostelname, int roomnumber) {
		//super(studentid, firstname, lastname, stype,);
		this.studentid=studentid;
		this.studentname=firstname + " " + lastname;
		this.stype=stype;
		this.feespermonth=feespermonth;
		this.hostelname = hostelname;
		this.roomnumber = roomnumber;
	}




	public String getHostelname() {
		return hostelname;
	}

	
	public int getRoomnumber() {
		return roomnumber;
	}
	
	public void displayStudentDetails() 
	{
		System.out.println("Student_id :"+studentid);
		System.out.println("Student_name:"+studentname);
		System.out.println("Student Type:"+stype);
		System.out.println("Feespermonth:"+feespermonth);
		System.out.println("HostelName:"+hostelname);
		System.out.println("Roomnumber:"+roomnumber);
	}
	
	
	
	
	
}
