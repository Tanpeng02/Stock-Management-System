import assignment.UserInfo;

public class UserInfoTest {

	public static void main(String[] args) {
		UserInfo a = new UserInfo();
		a.enterName();
		a.generateUserID();
		System.out.println("Name: " + a.getName() + "\nID: " + a.getUserID());

	}

}
