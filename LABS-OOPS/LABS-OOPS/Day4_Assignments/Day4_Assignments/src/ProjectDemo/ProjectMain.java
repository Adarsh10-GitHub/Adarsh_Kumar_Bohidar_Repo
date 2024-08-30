package ProjectDemo;

public class ProjectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee pm = new ProjectManager("Adarsh",8);
		Employee TAperm= new TechnicalAssociatePerm("Rahul", 5, 20);
		Employee TAcont = new TechnicalAssociateContract("Aditya", 2, 80, 60);
		System.out.println(pm.CalSalary());
		System.out.println(pm.CalMediclaim());
		System.out.println();
		System.out.println(TAperm.CalMediclaim());
		System.out.println(TAperm.CalSalary());
		System.out.println();
		System.out.println(TAcont.CalMediclaim());
		System.out.println(TAperm.CalSalary());
	}

}
