package Inheritance;

public class Hostelite extends Student{
	private String hostelname;
	private int roomnumber;
	
	public Hostelite(int studentid, String firstname, String lastname, char stype, String hostelname, int roomnumber) {
		super(studentid, firstname, lastname, stype);
		this.hostelname = hostelname;
		this.roomnumber = roomnumber;
	}

	public String getHostelname() {
		return hostelname;
	}

	
	public int getRoomnumber() {
		return roomnumber;
	}

	
	
	
	
	
}
