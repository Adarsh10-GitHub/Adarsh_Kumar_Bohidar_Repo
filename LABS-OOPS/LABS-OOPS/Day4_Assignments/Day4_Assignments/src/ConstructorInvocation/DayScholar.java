package ConstructorInvocation;

public class DayScholar extends PostGradStudent {
		
		private String residentialAddress;
		private double fees;

		public DayScholar(int sid, char stype, String sname, int pcourseid, String pcoursname, int pcoursfees,
				String residentialAddress) {
			super(sid, stype, sname, pcourseid, pcoursname, pcoursfees);
			this.residentialAddress = residentialAddress;
		}
		
		public void calculatefees() {
			this.fees = pcoursfees/6;
		}
		
		public double getfees() {
			System.out.println(fees);
			return fees;
		}
		
		
		
}
