import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class DeclarativeApproach {

	public static void main(String[] args) {
		List<Person> peoples = Persons.getPeople();
		
		// 1 - Lista de mulheres Usando "Filter"
		List<Person> females = peoples.stream()
			.filter(person -> person.getSexo().equals(Sexo.FEMININO))
			.collect(Collectors.toList());
		
		/* Only Women */
		females.forEach(System.out::println);
		
		// 2 - Lista todos usando "Sorted" por idade
		System.out.println("------sorted por idade---------");
		List<Person> sorted = peoples.stream().sorted(Comparator.comparing(Person::getIdade))
		.collect(Collectors.toList());
		
		sorted.forEach(System.out::println);
		
		
		System.out.println("------sorted em ordem reversa de idade---------");
		List<Person> sorted2 = peoples.stream().sorted(Comparator.comparing(Person::getIdade).reversed())
				.collect(Collectors.toList());
		
		sorted2.forEach(System.out::println);
		
		System.out.println("------sorted ordenado por idade e sexo---------");
		List<Person> sorted3 = peoples.stream().sorted(Comparator.comparing(Person::getIdade).thenComparing(Person::getSexo))
				.collect(Collectors.toList());
		
		sorted3.forEach(System.out::println);
				
		//All Match
		boolean allMatch = peoples.stream()
			.allMatch(person -> person.getIdade()>8);
		
		System.out.println("----------LISTA TODOS COM IDADE MAIOR QUE 8---------");
		System.out.println(allMatch);
		
		//Any Match
		boolean anyMatch = peoples.stream()
			.anyMatch(person -> person.getIdade()>8);
		System.out.println("----------LISTA TODOS COM IDADE MAIOR QUE 8---------");
		System.out.println(anyMatch);
		
		//None Match
		boolean noneMatch = peoples.stream()
			.noneMatch(person -> person.getNome().equals("Antônia"));
		System.out.println("----------LISTA TODOS QUE NÃO BATEM---------");
		System.out.println(noneMatch);
		
		//Max
		System.out.println("----------LISTA PESSOA DE MAIOR IDADE---------");
		peoples.stream()
			.max(Comparator.comparing(Person::getIdade))
			.ifPresent(System.out::println);
		
		//Min
		System.out.println("----------LISTA PESSOA DE MENOR IDADE---------");
		peoples.stream()
			.min(Comparator.comparing(Person::getIdade))
			.ifPresent(System.out::println);
		
		//Agrupa por sexo
		//Group
		Map<Sexo, List<Person>> groupBySexo = peoples.stream()
			.collect(Collectors.groupingBy(Person::getSexo));
			
		
		groupBySexo.forEach((sexo,people1)->{
			System.out.println(sexo);
			people1.forEach(System.out::println);
		});
		
		
		//Pesquisa a Idade da mulher mais velha mostrando 
		//Agrupada por nome 
		Optional<String> oldestFemaleAge = peoples.stream()
			.filter(person -> person.getSexo().equals(Sexo.FEMININO))
			.max(Comparator.comparing(Person::getIdade))
			.map(Person::getNome);
		
		oldestFemaleAge.ifPresent(name -> System.out.println(name));
		
		
		
			
			
	}

}
