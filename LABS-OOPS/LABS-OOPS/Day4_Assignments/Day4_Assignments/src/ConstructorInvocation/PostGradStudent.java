package ConstructorInvocation;

public class PostGradStudent extends Student1 {
	protected int pcourseid;
	protected String pcoursname;
	protected int pcoursfees;

	public PostGradStudent(int sid, char stype, String sname, int pcourseid, String pcoursname, int pcoursfees) {
		super(sid, stype, sname);
		this.pcourseid = pcourseid;
		this.pcoursname = pcoursname;
		this.pcoursfees = pcoursfees;
	}

	public int getPcourseid() {
		return pcourseid;
	}

	
	public String getPcoursname() {
		return pcoursname;
	}
	
	
	
	
	
}
