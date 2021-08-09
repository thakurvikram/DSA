package programming.practice.string;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorEx {

	public static void main(String[] args) {
		List<Person> list = new ArrayList();
		list.add(new Person("Poo", 25));
		list.add(new Person("Vik", 30));
		list.add(new Person("Poo", 5));
		list.add(new Person("Vik", 20));
		list.add(new Person("Poo", 15));
		list.add(new Person("Vik", 38));
		
		
		list.sort(new AgeComparator());
		System.out.println(list);
	}

	static class Person {
		private String name;
		private int age;

		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + "]";
		}
		
		
	}

	static class AgeComparator implements Comparator<Person> {

		@Override
		public int compare(Person o1, Person o2) {
			return o1.age - o2.age;
		}
	}
}
