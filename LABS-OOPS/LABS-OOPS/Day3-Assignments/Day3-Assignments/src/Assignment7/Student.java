package Assignment7;


public class Student {
	
	private int studentid;
	private String ResidentialStatus;
	private String studentname;
	private long feespermonth;
	
	
	
		public Student(int studentid, String residentialStatus, String firstname, String Lastname, long feespermonth) {
		super();
		this.studentid = studentid;
		ResidentialStatus = residentialStatus;
		this.studentname = firstname+" "+Lastname;
		this.feespermonth = feespermonth;
	}

		public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getResidentialStatus() {
		return ResidentialStatus;
	}

	public void setResidentialStatus(String residentialStatus) {
		ResidentialStatus = residentialStatus;
	}

	public long getFeespermonth() {
		return feespermonth;
	}

	public void setFeespermonth(long feespermonth) {
		this.feespermonth = feespermonth;
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

