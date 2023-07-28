package Question2;

public class Finally {
	public static void main(String[] args) throws CustomException, Exception {
		System.out.println("Division");
		String login = "Kavi";
		String pass = "ram1804";
		try {
			if (login.equals("Ram") && pass.equals("ram1804")) {
				System.out.println("Login Success");
			} else {
				throw new CustomException("Login Failed");
			}
		} finally {
			System.out.println("Welcome to email");
		}
	}

}
