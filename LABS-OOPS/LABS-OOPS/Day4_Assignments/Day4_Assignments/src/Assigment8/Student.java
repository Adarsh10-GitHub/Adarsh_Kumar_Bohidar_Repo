package Assigment8;


public abstract class Student {
	
	protected int studentid;
	protected String studentname;
	protected char stype;
	protected double feespermonth;
	
	
	
		
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
	
	public abstract void calculateFees(double Semfees);
	
	/*
	public void calculateFees(double Semfees,double hostelfees) {
		
		feespermonth=(Semfees/6.0) + hostelfees;
	*/	
	
	public void displayStudentDetails() 
	{
		System.out.println("Student_id :"+studentid);
		System.out.println("Student_name:"+studentname);
		System.out.println("Student Type:"+stype);
		System.out.println("Feespermonth:"+feespermonth);
	}
		
	}
	
	
	

	
	
	

