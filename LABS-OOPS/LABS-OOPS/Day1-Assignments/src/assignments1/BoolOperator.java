package assignments1;

public class BoolOperator {
	public static void main(String[] args) {
		boolean bool1=true;
		boolean bool2= false;
		boolean bool3=true;
		
		bool1=false;
		  if(bool1 || (bool2 && bool3))
		  {
			  System.out.println("success");
		  }
		  else {
			  System.out.println("Failure");
		  }
		  
		  System.out.println("bool2 = "+ bool2);
	}
}
