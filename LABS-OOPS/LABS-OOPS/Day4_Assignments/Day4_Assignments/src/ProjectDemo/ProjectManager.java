package ProjectDemo;

public class ProjectManager extends Employee {

	public ProjectManager(String name, int experience) {
		super(name, experience);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int CalSalary() {
		// TODO Auto-generated method stub
		
		return Experience*10000;
	}

	@Override
	public int CalMediclaim() {
		// TODO Auto-generated method stub
		return CalSalary();
	}
	
}
