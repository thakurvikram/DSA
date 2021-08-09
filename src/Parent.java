
public class Parent {

	private String test() {
		return "Parent";
	}

	protected final String doGet() {
		return test();
	}

}
