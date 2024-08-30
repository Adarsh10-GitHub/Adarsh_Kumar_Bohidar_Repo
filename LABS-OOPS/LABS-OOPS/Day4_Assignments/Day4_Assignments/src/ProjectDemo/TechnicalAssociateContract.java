package ProjectDemo;

public class TechnicalAssociateContract extends Employee{
	
	private int wages;
	private int hours;
	
	
	public TechnicalAssociateContract(String name, int experience, int wages, int hours) {
		super(name, experience);
		this.wages = wages;
		this.hours = hours;
	}

	@Override
	public int CalSalary() {
		// TODO Auto-generated method stub
		if(hours<=40) 
		{
			return wages*hours;
		}
		else 
		{
			return 40*wages+(hours-40)*2*wages;
		}
	}

	@Override
	public int CalMediclaim() {
		System.out.println("No mediclaim for Contract based Employees");
		return 0;
	}
	
}	
