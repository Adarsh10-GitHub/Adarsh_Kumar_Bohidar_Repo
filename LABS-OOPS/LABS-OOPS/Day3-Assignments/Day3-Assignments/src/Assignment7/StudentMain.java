package Assignment7;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int studentid=Integer.parseInt(args[0]);
		String ResidentialStatus=args[1];
		String Firstname=args[2];
		String Lastname=args[3];
		int semfees=Integer.parseInt(args[4]);
		long feespermonth;
		if(ResidentialStatus.equals("hostelite")) {
			
			long hostelfees=Long.parseLong(args[5]);
			feespermonth=(long) ((semfees/6.0)+hostelfees);
			
		}
		else {
			feespermonth=(long) (semfees/6.0);
	
		}
		
		Student s1= new Student(studentid,ResidentialStatus,Firstname,Lastname,feespermonth);
		
		System.out.println(s1.getStudentid() + " " + s1.getStudentname() + " "+s1.getResidentialStatus()+" "+s1.getFeespermonth());
		
	}

}
