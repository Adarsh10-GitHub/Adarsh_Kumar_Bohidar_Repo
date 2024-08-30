package Assigment8;

public class DayScholar extends Student{
	
	private String ResidentialAddress;

	public DayScholar(int studentid, String firstname, String lastname, char stype,double feespermonth, String residentialAddress) {
		super(studentid, firstname, lastname, stype);
		ResidentialAddress = residentialAddress;
		this.feespermonth=feespermonth;

	}

	public String getResidentialAddress() {
		return ResidentialAddress;
	}
	
	public void displayStudentDetails() 
	{
		System.out.println("Student_id :"+studentid);
		System.out.println("Student_name:"+studentname);
		System.out.println("Student Type:"+stype);
		System.out.println("Feespermonth:"+feespermonth);
		System.out.println("ResidentialAddress:"+ResidentialAddress);
	}

	@Override
	public void calculateFees(double Semfees) {
		// TODO Auto-generated method stub
		feespermonth=Semfees/6;
	}
	
	
		
	}

