package MyTest1;


public class LogIn implements Judge {
	Judge judge = null;
	int[] loginerr = new int[1];
	String username;
	String password;
	
	public LogIn() {
		
	}
	
	public LogIn(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	private void userJudge(String username, String password) {
		if(username != "tom") {
			loginerr[0] = 1;
		}
	}
	
	
	public int[] judge() {
		LogIn a = new LogIn();
		a.userJudge(username, password);
		return a.loginerr;
	}
	
}
