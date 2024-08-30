package assignments1;

public class Operators {
  public static void main(String[] args) {
	
	  int x= 10;
	  float y = 7.9f;
	  boolean bool1=true;
	  boolean bool2= false;
	  boolean bool3=true;
	  
	  System.out.println("Modulus operator");
	  System.out.println(x + "%" + y + "=" + (x%y));
	  System.out.println();
	  
	  System.out.println("String concatenation");
	  System.out.println("Day"+ 1 + "session");
	  System.out.println("\n" + 2 + 3 + "\n");
	  System.out.println();
	  
	  
	  System.out.println("Equality operator");
	  System.out.println(x==y);
	  y=10.0f;
	  System.out.println(x==y);
	  System.out.println();
	  
	  System.out.println("Logical operator");
	  bool1=false;
	  if(bool1 || (bool2 && bool3))
	  {
		  System.out.println("success");
	  }
	  else {
		  System.out.println("Failure");
	  }
	  
}
}
