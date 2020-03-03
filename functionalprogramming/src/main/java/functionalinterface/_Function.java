package functionalinterface;

import java.util.function.Function;

public class _Function {

	public static void main(String[] args) {
		
		//Funções que pegam 1 argumento e produzem 1 resultado 
		int incrementa = increment(1);
		System.out.println(incrementa);

		int incrementa2 = incrementaByUmaFuncao.apply(2);
		System.out.println(incrementa2);
		
		System.out.println("Funções Encadeadas");
		int multiplica = multiplicaPor10Function.apply(incrementa2);
		System.out.println(multiplica);
		
		System.out.println("Funções Encadeadas {{chaining functions}} 2 alternativa");
		Function<Integer, Integer> adiciona1eMultiplicaPor10 = 
				incrementaByUmaFuncao.andThen(multiplicaPor10Function);
		
		System.out.println(adiciona1eMultiplicaPor10.apply(4));
		
	}

	public static int increment(int number) {
		return number++;
	}

	static Function<Integer, Integer> incrementaByUmaFuncao = 
			number -> number++;
	
	static Function<Integer,Integer> multiplicaPor10Function = 
			number -> number * 10;
	

}
