package javamaster2020;

public class Abcd {

	public static void main(String[] args) {

		String email = "tejas@gmail.com";
		String password = "tejas123";

		try {
			System.out.println(GoogleLoginApi.authentication(email, password));
		} catch (BlankDataException e) {
			System.out.println("Please Enter email/password");
		}catch(InvalidEmailException e) {
			System.out.println("Please Enter Valid Email");
		}
	}
}
