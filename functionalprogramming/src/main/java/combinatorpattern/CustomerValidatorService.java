package combinatorpattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {
	
	private boolean isEmailValid(String email) {
		return email.contains("@"); 
	}
	
	private boolean isTelefoneValid(String telefone) {
		return telefone.startsWith("+0") ; 
	}
	
	private boolean isAdulto(LocalDate dob) {
		return Period.between(dob,LocalDate.now()).getYears()> 18; 
	}
	
	public boolean isValid(Customer customer) {
		return isEmailValid(customer.getEmail()) &&
			   isTelefoneValid(customer.getTelefone()) &&
			   isAdulto(customer.getDob()); 
	}
	
}
