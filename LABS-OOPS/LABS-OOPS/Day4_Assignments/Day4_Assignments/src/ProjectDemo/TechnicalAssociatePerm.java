package ProjectDemo;

public class TechnicalAssociatePerm extends Employee {
	
	private int certifications;

	public TechnicalAssociatePerm(String name, int experience, int certifications) {
		super(name, experience);
		this.certifications = certifications;
	}

	@Override
	public int CalSalary() {
		// TODO Auto-generated method stub
		return Experience*5000 + certifications*1000;
		
	}

	@Override
	public int CalMediclaim() {
		// TODO Auto-generated method stub
		return CalSalary()*2;
	}
	
}
