package E_commerse;

public abstract class User {
	private int userId;
	private String username;
	private String password;
	private String email;

	public User(int userId, String username, String password, String email) {
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.email = email;
	}

	public int getUserId() {
		return userId;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public void login() {
		System.out.println(username + " logged in.");
	}

	public void logout() {
		System.out.println(username + " logged out.");
	}

	public abstract void viewProfile();

	public abstract void updateProfile(String newUsername, String newPassword, String newEmail);
}
