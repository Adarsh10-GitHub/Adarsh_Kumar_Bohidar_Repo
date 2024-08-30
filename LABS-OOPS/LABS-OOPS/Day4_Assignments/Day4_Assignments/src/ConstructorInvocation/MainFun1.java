package ConstructorInvocation;

public class MainFun1 {
	public static void main(String[] args) {
		
		DayScholar day = new DayScholar(1001, 'D', "Manu", 5, "OOPS", 16000, "Vijayanagar");
		System.out.println(day.getfees());
		System.out.println(day.getPcourseid());
		System.out.println(day.getPcoursname());
	}
}
