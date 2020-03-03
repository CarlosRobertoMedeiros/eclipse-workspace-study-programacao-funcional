# eclipse-workspace-study-programacao-funcional

Exemplos Simples utilizando os princípios da programação funcional.

	- Comparação entre Programação Imperativa e Programação Declarativa
	- Implementação das funcionalidades do pacote java.util.stream.Collectors

		- Lambda
		- stream().sorted
		- stream().sorted.reverse()
		- stream().sorted(Comparator)
		- stream().match()	
		- stream().anymatch()	
		- stream().max()	
		- stream().min()	
		- stream().group()	

		Junções
			Optional<String> oldestFemaleAge = peoples.stream()
				.filter(person -> person.getSexo().equals(Sexo.FEMININO))
				.max(Comparator.comparing(Person::getIdade))
				.map(Person::getNome);

		Programação Funcional
			- Função declarativa
			- utilização do apply
			- Função encadeada
			- Utilização de BiFunções
			- Utilizando a Interface Funcional Consumer





