package Assigment8;

public class HostelMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hostelite h1 = new Hostelite(7, "Adarsh", "Bohidar", 'H', 0,"A1", 99);
		h1.calculateFees(1000);
		h1.displayStudentDetails();
		
		DayScholar ds1= new DayScholar(8, "Rahul", "Kumar", 'D',0, "Chennai");
		ds1.calculateFees(8000);
		ds1.displayStudentDetails();
	}

}
