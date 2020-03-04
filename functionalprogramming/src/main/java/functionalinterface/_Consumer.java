package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

	public static void main(String[] args) {
		// Normal Java Function
		Customer maria = new Customer("Maria", "99999");

		// Consumer Functional Interface
		greetCustomerConsumer.accept(maria);
		// Comparação
		greetCustomer(maria);

		// Utilizando BiConsumer
		greetCustomerV2.accept(maria, true);
		// Comparação
		greetCustomerv2(maria, true);

	}

	static BiConsumer<Customer, Boolean> greetCustomerV2 = (customer, showPhoneNumber) -> System.out
			.println("Hello " + customer.customerName + ", thank for registring phone number "
					+ (showPhoneNumber ? customer.customerPhoneNumber : "*****"));

	static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println(
			"Hello " + customer.customerName + ", thank for registring phone number " + customer.customerPhoneNumber);

	static void greetCustomerv2(Customer customer, boolean showPhoneNumber) {
		System.out.println("Hello " + customer.customerName + ", thank for registring phone number "
				+ (showPhoneNumber ? customer.customerPhoneNumber : "******"));
	}

	static void greetCustomer(Customer customer) {
		System.out.println("Hello " + customer.customerName + ", thank for registring phone number "
				+ customer.customerPhoneNumber);
	}

	static class Customer {
		private final String customerName;
		private final String customerPhoneNumber;

		public Customer(String customerName, String customerPhoneNumber) {
			this.customerName = customerName;
			this.customerPhoneNumber = customerPhoneNumber;
		}

	}

}
