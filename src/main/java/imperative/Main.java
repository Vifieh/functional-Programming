package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static imperative.Main.Gender.*;

public class Main {
	
	public static void main(String[] args) {
		
		List<Person> people = List.of(
				new Person("John", MALE),
				new Person("Maria", FEMALE),
				new Person("Aisha", FEMALE),
				new Person("Alex", MALE),
				new Person("Alice", FEMALE)

				);
		System.out.println("//imperative approach");
		//imperative approach
		ArrayList<Person> females = new ArrayList<Person>();
			for(Person person : people) {
				if(FEMALE.equals(person.gender)) {
					females.add(person);
				}
			}
			for(Person female : females) {
				System.out.println(female);
			}
			
			System.out.println("//Declarative approach");
			//Declarative approach
			people.stream()
			.filter(person -> FEMALE.equals(person.gender))
			.forEach(System.out::println);
			}
	
		static class Person {
			private final String name;
			private final Gender gender;
			
			public Person(String name, Gender gender) {
				super();
				this.name = name;
				this.gender = gender;
			}

			@Override
			public String toString() {
				return "Person [name=" + name + ", gender=" + gender + "]";
			}
			
		}
		
		enum Gender {
			MALE, FEMALE
		}
		
}


 