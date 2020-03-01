import java.util.ArrayList;
import java.util.List;

public class ImperactiveApproach {

	public static void main(String[] args) {
		List<Person> peoples = Persons.getPeople();

		// 1 - Lista de mulheres
		List<Person> females = new ArrayList<>();

		for (Person person : peoples) {

			if (person.getSexo().equals(Sexo.FEMININO)) {
				females.add(person);
			}
		}

		/* Only Women */
		for (Person person : females) {
			System.out.println(person);
		}

	}
}
