package MyTest1;


import java.util.HashMap;

public class Error {
	public static final HashMap<Integer,String> errors = new HashMap<Integer,String>();
	static {
		errors.put(0, " ");
		errors.put(1, "用户名或密码错误");
		errors.put(2, "用户名格式错误");
		errors.put(3, "密码格式错误");
		errors.put(4, "邮箱格式错误");
	}
	
	
}
