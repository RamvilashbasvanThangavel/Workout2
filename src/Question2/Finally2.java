package Question2;

public class Finally2 {
	public static void main(String[] args) throws CustomException, Exception {
		System.out.println("Marks");
		int mark = 98;		
		try {
			if(mark>100) {
				throw new CustomException("Enter Valid Marks");
			}
			if (mark>=50 && mark<=100) {
				System.out.println("Pass");
			} else {
				throw new CustomException("Not Pass");
			}
		} finally {
			System.out.println("Result Released");
		}
	}

}
