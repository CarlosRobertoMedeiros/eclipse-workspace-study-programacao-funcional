package functionalprogramming.imperative;

import java.util.ArrayList;
import java.util.List;

import functionalprogramming.model.Pessoa;
import functionalprogramming.model.Pessoas;
import functionalprogramming.model.Sexo;

public class Main {

	public static void main(String[] args) {

		List<Pessoa> pessoas = Pessoas.getPessoas();

		// Lista de Mulheres
		List<Pessoa> mulheres = new ArrayList<>();

		for (Pessoa pessoa : pessoas) {
			if (Sexo.FEMININO.equals(pessoa.getSexo())){
				mulheres.add(pessoa);
			}
		}
		
		for (Pessoa mulher : mulheres) {
			System.out.println(mulher);
		}
		
	}
}
