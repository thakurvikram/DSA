package interview.learning;

import java.util.Optional;

public class Java8 {

	public static void main(String[] args) {
		Optional<String> abc = Optional.ofNullable(null);
		String xyz = abc.get();
		System.out.println(xyz);

	}

}
