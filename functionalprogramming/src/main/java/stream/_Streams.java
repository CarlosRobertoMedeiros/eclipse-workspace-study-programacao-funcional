package stream;

import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import functionalprogramming.model.Pessoa;
import functionalprogramming.model.Pessoas;
import functionalprogramming.model.Sexo;

public class _Streams {

	public static void main(String[] args) {

		// Função set Normal usada para sexo
		Pessoas.getPessoas().stream().map(pessoa -> pessoa.getSexo()).collect(Collectors.toSet())
				.forEach(System.out::println);

		// Tamanho do Nome de cada pessoa
		// Apenas realizei a decomposição para mostrar as possibilidades da Programação
		// Funcional
		// Normalmente tudo é colocado junto
		Function<Pessoa, String> personStringFunction = pessoa -> pessoa.getNome();
		ToIntFunction<String> personNameLength = String::length;
		IntConsumer println = System.out::println;

		Pessoas.getPessoas().stream().map(personStringFunction).mapToInt(personNameLength).forEach(println);

		Predicate<Pessoa> pessoaPredicate = pessoa -> Sexo.FEMININO.equals(pessoa.getSexo());

		// Usando assim todos tem que bater 
		boolean containsSomenteMulheres = Pessoas.getPessoas().stream().allMatch(pessoaPredicate);

		System.out.println(containsSomenteMulheres);

		// Usando assim alguns tem que bater
		// Caso exista algum predicado de pessoa
		boolean containsMulheres = Pessoas.getPessoas().stream().anyMatch(pessoaPredicate);

		System.out.println(containsMulheres);
		
		// Usando assim alguns tem que bater
		// Caso exista algum predicado de pessoa
		Predicate<Pessoa> pessoaSemInfornarSexoPredicate = pessoa -> Sexo.NAOINFORMADO.equals(pessoa.getSexo());
		boolean containsPessoasQueNaoQueremInformaroSexo = Pessoas.getPessoas().stream().noneMatch(pessoaPredicate);
		System.out.println(containsPessoasQueNaoQueremInformaroSexo);
		
		

	}

}

//Continuar a Partir de 01:17
