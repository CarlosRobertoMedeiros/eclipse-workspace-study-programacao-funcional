package functionalinterface;

import java.util.function.BiFunction;

public class _Function2 {

	public static void main(String[] args) {
		//Funções que pegam 2 argumentos e produzem 1 resultado
		System.out.println("Trabalhando com BiFunctions");
		System.out.println(incrementByOneAndMultiply(4, 100));
		System.out.println(incrementByOneAndMultiplyByFunction.apply(4, 100));
		
	}
	
	static int incrementByOne(int number) {
		return number++;
	}
	
	
	static BiFunction<Integer, Integer, Integer>incrementByOneAndMultiplyByFunction = 
			(numbertoIncrementByOne,numberToMultiplyBy) 
				-> (numbertoIncrementByOne ++) * numberToMultiplyBy;
	
	
	static int incrementByOneAndMultiply(int number, int numberToMultiply) {
		return (number++) * numberToMultiply;
	}

}
