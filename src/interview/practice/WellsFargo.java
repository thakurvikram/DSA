package interview.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WellsFargo {

	public static void main(String[] args) {

		Emplyee e1 = new Emplyee(1, "Vikram", 8000, "Pune");
		Emplyee e2 = new Emplyee(2, "Pooja", 7000, "Pune");
		Emplyee e3 = new Emplyee(3, "Pillu", 9000, "Bengaluru");
		Emplyee e4 = new Emplyee(4, "Kanha", 6000, "Bengaluru");
		Emplyee e5 = new Emplyee(5, "Palak", 10000, "Bengaluru");

		List<Emplyee> list = new ArrayList<Emplyee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);

		// Optional<Emplyee> maxSalaryEmp =
		// list.stream().collect(Collectors.maxBy(Comparator.comparing(Emplyee::getSalary)));

		Map<String, Optional<Emplyee>> collect = list.stream().collect(Collectors.groupingBy(e -> e.getLocation(),
				Collectors.maxBy(Comparator.comparingInt(Emplyee::getSalary))));

		System.out.println("Employee with max salary:" + collect);
	}
}