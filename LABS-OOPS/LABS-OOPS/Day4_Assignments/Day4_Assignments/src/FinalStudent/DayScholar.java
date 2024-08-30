package FinalStudent;

public class DayScholar extends Student2{
	private String address;

	public DayScholar(int sid,char stype,String sname,double feespermonth,String address) {
		super();
		this.address = address;
		this.sid=sid;
		this.stype=stype;
		this.sname=sname;
		this.feespermonth=feespermonth;
		
	}
	
	

	public void setAddress(String address) {
		this.address = address;
	}

	public DayScholar() {
		// TODO Auto-generated constructor stub
	}

	public void DisplayDetails() {
		
		super.displayDetails();
		System.out.println("ResidentialAddress:"+address);
	}
	
	
}
