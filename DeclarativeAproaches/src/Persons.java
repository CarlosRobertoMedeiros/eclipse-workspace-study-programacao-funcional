import java.util.ArrayList;
import java.util.List;

public class Persons {

	public static List<Person> getPeople(){
		List<Person> pessoas = new ArrayList<>();
		
		pessoas.add(new Person("Carlos Roberto", Sexo.MASCULINO, 38));
		pessoas.add(new Person("Luciene Alves", Sexo.FEMININO, 37));
		pessoas.add(new Person("Ezequias Alves", Sexo.MASCULINO, 32));
		pessoas.add(new Person("Antônia", Sexo.FEMININO, 65));
		return pessoas;
	}
	
}
