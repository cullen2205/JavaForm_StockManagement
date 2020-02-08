package Models;

public class LoginInfo {
	public String username;
	public String password;
	public eRole role = eRole.User;
	
	public static String usernameStatic = "Username";
	public static int count = 0;
	
	
	public LoginInfo() {
		++count;
		username = usernameStatic + count;
		password = "1";
	}
	
	public enum eRole{
		User,
		Admin
	}
}
