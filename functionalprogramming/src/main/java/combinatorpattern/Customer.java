package combinatorpattern;

import java.time.LocalDate;

public class Customer {

	private final String nome;
	private final String email;
	private final String telefone;
	private final LocalDate dob;

	public Customer(String nome, String email, String telefone, LocalDate dob) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.dob = dob;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public LocalDate getDob() {
		return dob;
	}
	
	public String getTelefone() {
		return telefone;
	}

}
