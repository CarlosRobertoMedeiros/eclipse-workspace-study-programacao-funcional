package functionalprogramming.declarative;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import functionalprogramming.model.Pessoa;
import functionalprogramming.model.Pessoas;
import functionalprogramming.model.Sexo;

//olhar o pacote java.util.function
//https://docs.oracle.com/javase/8/docs/api/
public class Main {

	public static void main(String[] args) {

		List<Pessoa> pessoas = Pessoas.getPessoas();
		
		System.out.println("Exemplo com Stream");
		List<Pessoa> mulheres2 = pessoas.stream()
				.filter(pessoa -> pessoa.getSexo().equals(Sexo.FEMININO))
				.collect(Collectors.toList());
			mulheres2.forEach(System.out::println);
		
		System.out.println("Exemplo com Predicate");
		Predicate<Pessoa> pessoaPredicate = pessoa -> pessoa.getSexo().equals(Sexo.FEMININO);
		List<Pessoa> mulheres = pessoas.stream()
			.filter(pessoaPredicate)
			.collect(Collectors.toList());
		mulheres.forEach(System.out::println);
		
		
			

	}
	
	
	

}
