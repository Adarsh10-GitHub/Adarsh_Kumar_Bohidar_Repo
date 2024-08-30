package ConstructorInvocation;

public class Student1 {
	protected int sid;
	protected char stype;
	protected String sname;
	private static int c=0;
	
	public Student1() {
	// TODO Auto-generated constructor stub
		sid=++c;
	}

	public Student1(int sid, char stype, String sname) {
		super();
		this.sid = sid;
		this.stype = stype;
		this.sname = sname;
	}
	
	
	
	
}
