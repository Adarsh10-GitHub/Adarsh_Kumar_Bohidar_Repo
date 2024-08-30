package Inheritance;


public class Student {
	
	private int studentid;
	private String studentname;
	private char stype;
	private double feespermonth;
	
	
	
		
		public Student(int studentid, String firstname, String lastname,char stype) {
		super();
		this.studentid = studentid;
		this.studentname = firstname+" "+lastname;
		this.stype = stype;
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

		
	     public double getFeespermonth() {
			return feespermonth;
		}


		public void setFeespermonth(double feespermonth) {
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
	
	public void calculateFees(double Semfees) {
		feespermonth=Semfees/6.0;
	}
	
	public void calculateFees(double Semfees,double hostelfees) {
		
		feespermonth=(Semfees/6.0) + hostelfees;
		
		
	}
	
	
	

	
	
	
}

