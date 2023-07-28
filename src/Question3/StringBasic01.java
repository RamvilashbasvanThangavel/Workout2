package Question3;

public class StringBasic01 {
	public static void main(String[] args) {
	String a = "RamvilashBasvan";    // it is called as String Literal.
	String b = "Ramvilash";
	String c = "basvan";    
	
	System.out.println(a.hashCode()); 
	// a & b stored in same String Pool Memory.
	System.out.println(b.hashCode()); 
	// a & b stored in same String Pool Memory.
	System.out.println(c.hashCode()); 
	// c stored in different String pool Memory if any different case occurs means.
	  a = a.concat(b);
	  System.out.println(a.hashCode()); 
	  System.out.println(a);
	// if we declare the value for inizalized string means we will get different memory for that decleration. 
	}
}
