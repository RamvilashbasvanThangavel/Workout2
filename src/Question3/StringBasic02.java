package Question3;

public class StringBasic02 {
	public static void main(String[] args) {
		String a = "RamvilashBasvan";
		String b = "Ramvilash";

		StringBuffer s1 = new StringBuffer(a);
		System.out.println(s1);
		// getting print of s1
		System.out.println(s1.hashCode());
		// getting HashCode of s1
		System.out.println(s1.reverse());
		// There are more Methods used in StringKeyWord.
		// sample methods used in StringBuffer and StringBuilder are 
		//reverese().
		//append().

		StringBuilder s2 = new StringBuilder(b);
		System.out.println(s2.append(" " + s1));
		
		

	}
}
