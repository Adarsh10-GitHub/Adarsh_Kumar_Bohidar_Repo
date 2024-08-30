package Student2;

public class StudentMain {
	public static void main(String[] args) {
		Student s1=new Student(1, 'H',"adarsh","Bohidar");
		System.out.println(s1.getStudentid() + " " + s1.getStype() + " " + s1.getStudentname());
		Student s2=new Student();
		s2.setStudentid(5);
		s2.setStype('D');
		s2.setStudentname("Rahul", "Kumar");
		
		System.out.println(s2.getStudentid() + " " + s2.getStype() + " " + s2.getStudentname());

	}
}
