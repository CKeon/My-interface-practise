package MyTest1;


public class Test {

	public static void main(String[] args) {
		Judge a = new Register("a", "b", "c");
		System.out.println(Error.errors);
		System.out.println("-------");
		System.out.println(Error.errors.get(a.judge()[0]));
		System.out.println(Error.errors.get(a.judge()[1]));
		System.out.println(Error.errors.get(a.judge()[2]));
		Judge b = new LogIn("a", "b");
		System.out.println("-------");
		System.out.println(Error.errors.get(b.judge()[0]));
		
	};

}
