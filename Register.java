package MyTest1;


public class Register implements Judge {
	Judge judge = null;
	int[] registererr = new int[3];
	String username;
	String password;
	String email;
	
	public Register() {
		
	}
	
	public Register(String username, String password, String email) {
		this.username = username;
		this.password = password;
		this.email = email;
	}
	
	private void usernameJudge(String username) {
		if(username != "tom") {
			registererr[0] = 2;
		}
		
	}
	
	private void passwordJudge(String password) {
		if(password != "tom") {
			registererr[1] = 3;
		}
	}
	
	private void emailJudge(String email) {
		if(email != "tom") {
			registererr[2] = 4;
		}
	}
	
	public int[] judge() {
		Register a = new Register();
		a.usernameJudge(username);
		a.passwordJudge(password);
		a.emailJudge(email);
		return a.registererr;
	}
}
