package Student2;

public class Student {
	
	private int studentid;
	private char stype;
	private String studentname;
	
	public Student(int studentid, char stype, String firstname,String lastname) {
		super();
		this.studentid = studentid;
		this.stype = stype;
		this.studentname = firstname +" "+ lastname;
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public char getStype() {
		return stype;
	}

	public void setStype(char stype) {
		this.stype = stype;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String firstname ,String lastname) {
		this.studentname = firstname + " "+lastname;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

	
	
	
}
