package combinatorpattern;

import java.time.LocalDate;

import combinatorpattern.CustomerRegistrationValidator.ValidationResult;


public class Main {
	
	public static void main(String[] args) {
		
		Customer customer = new Customer(
				"Alice",
				"alice@gmail.com",
				"+08545845",
				LocalDate.of(2000, 1, 1)
		);
		
		System.out.println(new CustomerValidatorService().isValid(customer));
		
		//Usando Combinator Pattern TUDO IMPLEMENTADO NA CLASSE CustomerRegistrationValidator
		ValidationResult resultado = CustomerRegistrationValidator
			.isEmailValido()
			.and(CustomerRegistrationValidator.isTelefoneValido())
			.and(CustomerRegistrationValidator.isMaiorDe18())
			.apply(customer);
		
		System.out.println(resultado);
		
		if (resultado!=ValidationResult.SUCCESSO) {
			throw new IllegalStateException(resultado.name());
		}
		
		//Continuar a partir de 01:55
		
		
	}

}
