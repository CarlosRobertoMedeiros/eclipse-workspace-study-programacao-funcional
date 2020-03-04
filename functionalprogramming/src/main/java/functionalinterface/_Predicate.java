package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

	public static void main(String[] args) {

		// Imperative Program sem Predicates
		System.out.println(isPhoneNumberValid("07000000000"));
		System.out.println(isPhoneNumberValid("09007500000"));

		// Declarative Program com Predicates
		System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
		System.out.println(isPhoneNumberValidPredicate.test("09007500000"));
		
		//Predicate aninhado com and e test Numero Valido que contem 3
		System.out.println(isPhoneNumberValidPredicate.and(constainsNumber3).test("09007500000"));
		System.out.println(isPhoneNumberValidPredicate.and(constainsNumber3).test("07000000003"));
		
		

	}

	static boolean isPhoneNumberValid(String phoneNumber) {
		return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
	}

	static Predicate<String> isPhoneNumberValidPredicate = phoneNumber -> phoneNumber.startsWith("07")
			&& phoneNumber.length() == 11;
	
	static Predicate<String> constainsNumber3 = phoneNumber ->
		phoneNumber.contains("3");

}


//Continuar com 01:20 minutos utilizando o BiConsumer
