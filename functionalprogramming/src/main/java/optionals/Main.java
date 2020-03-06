package optionals;

import java.util.Optional;

public class Main {
	
	
	public static void main(String[] args) {
		
		Object value = Optional.ofNullable(null)
				.orElseGet(() -> "hello");
		System.out.println(value);
		
		Object value2 = Optional.ofNullable("Hello2")
			.orElseThrow(()-> new IllegalStateException("exception"));
		System.out.println(value2);
		
		//Dentro do ifPresent deve-se colocar a Regra de Negócio
		Optional.ofNullable("pedro@gmail.com")
			.ifPresent(email -> System.out.println("Enviando email para "+email));
		
		/*
		 * Dentro da versão Java 11
		Optional.ofNullable(null)
			.ifPresentOrElse(
					email -> System.out.println("Enviando email para "+email),
					() -> {
						System.out.println("Não foi Possível Enviar o Email")
					});
		*/
		
			

		
		
	}

}
