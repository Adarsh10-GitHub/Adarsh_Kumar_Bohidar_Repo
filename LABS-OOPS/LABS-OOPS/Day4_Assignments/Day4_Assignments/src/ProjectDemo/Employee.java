package ProjectDemo;

public abstract class Employee {
	
	protected String name;
	protected int Experience;
	
	public Employee(String name, int experience) {
		super();
		this.name = name;
		Experience = experience;
	}
	
	public abstract int CalSalary();
	
	public abstract int CalMediclaim();
}



