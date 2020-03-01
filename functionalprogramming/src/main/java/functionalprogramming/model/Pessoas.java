package functionalprogramming.model;

import java.util.ArrayList;
import java.util.List;

public class Pessoas {

	public static List<Pessoa> getPessoas() {

		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa("Carlos Roberto", Sexo.MASCULINO, 37));
		pessoas.add(new Pessoa("Luciene Alves", Sexo.FEMININO, 35));
		pessoas.add(new Pessoa("Antônia Alves", Sexo.FEMININO, 65));
		pessoas.add(new Pessoa("Ezequias Alves", Sexo.MASCULINO, 32));
		pessoas.add(new Pessoa("Leticia Medeiros", Sexo.FEMININO, 25));
		pessoas.add(new Pessoa("Aline Souza", Sexo.FEMININO, 25));
		pessoas.add(new Pessoa("Xavier Machado", Sexo.MASCULINO, 52));

		return pessoas;

	}

}
