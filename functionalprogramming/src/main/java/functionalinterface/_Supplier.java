package functionalinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
	
	public static void main(String[] args) {
		
		//Imperative Approach
		System.out.println(getDBConnectionUrl());
		
		//Declarative Approach
		System.out.println(getDBConnectionUrlSupplier.get());
		
		//Imperative Approach
		System.out.println(getDBConnectionUrlList());
		
		//Declarative Approach --Java 8--
		System.out.println(getDBConnectionUrlsListSupplier.get());

	}
	
	static String getDBConnectionUrl () {
		return "jdbc://localhost:5432/users";
	}
	
	static Supplier<String> getDBConnectionUrlSupplier = () ->
		"jdbc://localhost:5432/users";
		
	static List<String> getDBConnectionUrlList (){
		List<String> listaUrls = new ArrayList<>();
		listaUrls.add("jdbc://localhost:5432/users");
		listaUrls.add("jdbc://localhost:5432/alunos");
		return listaUrls;
	} 
	
	static Supplier<List<String>> getDBConnectionUrlsListSupplier = () -> 
		Arrays.asList("jdbc://localhost:5432/users",
					  "jdbc://localhost:5432/alunos");
	
}
