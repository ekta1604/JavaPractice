package javamaster2020;

public class GoogleLoginApi {

	public static boolean authentication(String email, String password) throws InvalidEmailException {

		if (email.trim().length() == 0 || password.trim().length() == 0) {
			throw new BlankDataException();
		}
		if (!email.endsWith("@gmail.com")) {
			throw new InvalidEmailException();
		}
		return true;
	}
}

class InvalidEmailException extends Exception {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	public InvalidEmailException() {
		super("Invalid Email");
	}
}

class BlankDataException extends RuntimeException {
	public BlankDataException() {
		super("Data must not blank");
	}
}

//1 extends Exception 
//2 pass your error msg to parent class 
//3 thorw your exception [ throw ]
