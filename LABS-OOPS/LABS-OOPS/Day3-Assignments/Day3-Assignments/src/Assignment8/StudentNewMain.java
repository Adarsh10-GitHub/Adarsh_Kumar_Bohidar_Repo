package Assignment8;

import Assignment7.Student;

public class StudentNewMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int studentid=Integer.parseInt(args[0]);
		String ResidentialStatus=args[1];
		String Firstname=args[2];
		String Lastname=args[3];
		char stype=args[4].charAt(0);
		
		Assignment8.Student s2 = new Assignment8.Student(studentid,Firstname,Lastname,stype);
		
		int semfees=Integer.parseInt(args[5]);
		if(ResidentialStatus.equals("hostelite")) {
			
			long hostelfees=Long.parseLong(args[6]);
			s2.setResidentialStatus(ResidentialStatus);
			s2.calculateFees(semfees, hostelfees);
			
		}
		else {
			s2.setResidentialStatus(ResidentialStatus);
			s2.calculateFees(semfees);
		}
		
		
		System.out.println(s2.getStudentid() + " " + s2.getStudentname() + " "+s2.getResidentialStatus()+" "+s2.getFeespermonth() + " " + s2.getStype());
	
	}

}
