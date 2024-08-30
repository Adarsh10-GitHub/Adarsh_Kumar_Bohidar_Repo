package FinalStudent;

public class Student2 {
	protected int sid;
	protected char stype;
	protected String sname;
	protected double feespermonth;
	protected final int semfees=1200;
	public Student2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	
	public void setStype(char stype) {
		this.stype = stype;
	}

	public void calculatefees() {
		feespermonth=semfees/6;
	}
	
	public void displayDetails() {
		
		System.out.println("Sid:"+sid);
		System.out.println("sname:"+sname);
		System.out.println("stype:"+stype);
		System.out.println("Feespermonth:"+feespermonth);
	}
	
	
	
	
	
}
