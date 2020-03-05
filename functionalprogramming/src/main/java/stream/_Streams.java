package stream;

import java.util.stream.Collectors;

import functionalprogramming.model.Pessoas;

public class _Streams {

	public static void main(String[] args) {

		//Função set Normal usada para sexo
		Pessoas.getPessoas().stream()
			.map(pessoa -> pessoa.getSexo())
			.collect(Collectors.toSet())
			.forEach(System.out::println);
		
		//Tamanho do Nome de cada pessoa 
		Pessoas.getPessoas().stream()
			.map(pessoa -> pessoa.getNome())
			.mapToInt(String::length)
			.forEach(System.out::println);
			
		
	}

}

//Continuar a Partir de 01:17
