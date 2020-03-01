package functionalprogramming.declarative;

import java.util.List;
import java.util.stream.Collectors;

import functionalprogramming.model.Pessoa;
import functionalprogramming.model.Pessoas;
import functionalprogramming.model.Sexo;

public class Main {

	public static void main(String[] args) {

		List<Pessoa> pessoas = Pessoas.getPessoas();

		pessoas.stream()
			.filter(pessoa -> pessoa.getSexo().equals(Sexo.FEMININO))
			.collect(Collectors.toList())
			.forEach(System.out::println);

	}
	
	//Continuar do minuto 20
	//olhar o pacote java.util.function 

}
