package combinatorpattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import combinatorpattern.CustomerRegistrationValidator.ValidationResult;

public interface CustomerRegistrationValidator 
			extends Function<Customer,ValidationResult>{
	
	
	static CustomerRegistrationValidator isEmailValido() {
		return customer -> customer.getEmail().contains("@") ?
				ValidationResult.SUCCESSO : ValidationResult.EMAIL_NAO_VALIDO;
	}
	
	static CustomerRegistrationValidator isTelefoneValido() {
		return customer -> customer.getTelefone().startsWith("+0") ?
				ValidationResult.SUCCESSO : ValidationResult.TELEFONE_NAO_VALIDO;
	}
	
	
	static CustomerRegistrationValidator isMaiorDe18() {
		return customer -> Period.between(customer.getDob(),LocalDate.now()).getYears()> 18  ?
				ValidationResult.SUCCESSO : ValidationResult.NAO_E_ADULTO;
	}
	
	default CustomerRegistrationValidator and (CustomerRegistrationValidator other) {
		return customer -> {
			ValidationResult result = this.apply(customer);
			return result.equals(ValidationResult.SUCCESSO)? other.apply(customer):result;

		};
	}
	
	
	enum ValidationResult{
		SUCCESSO,
		TELEFONE_NAO_VALIDO,
		EMAIL_NAO_VALIDO,
		NAO_E_ADULTO,
	}
	
	
	
	

}
