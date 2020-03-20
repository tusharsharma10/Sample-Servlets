package webapp;

public class UserValidationService {

	public boolean isUserValid(String userId, String password) {

		if (userId.equals("Tushar") && password.equals("@123ts"))
			return true;
		else
			return false;

	}

}
