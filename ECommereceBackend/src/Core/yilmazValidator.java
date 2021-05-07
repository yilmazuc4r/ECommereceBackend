package Core;

import Entity.Concrete.Customer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class yilmazValidator implements ValidationService {

	private Boolean validUserName = false;
	private Boolean validPassWord = false;
	private Boolean validLastName = false;
	private Boolean validEmail = false;

	public Boolean getValidUserName() {
		return validUserName;
	}

	public void setValidUserName(Boolean validUserName) {
		this.validUserName = validUserName;
	}

	public Boolean getValidPassWord() {
		return validPassWord;
	}

	public void setValidPassWord(Boolean validPassWord) {
		this.validPassWord = validPassWord;
	}

	public Boolean getValidLastName() {
		return validLastName;
	}

	public void setValidLastName(Boolean validLastName) {
		this.validLastName = validLastName;
	}

	public Boolean getValidEmail() {
		return validEmail;
	}

	public void setValidEmail(Boolean validEmail) {
		this.validEmail = validEmail;
	}

	public Boolean validUserName(Customer customer) {

		if (customer.getUserFirstName().length() >= 2) {
			System.out.println("Kullanýcý adý doðrulandý");

			setValidUserName(true);
			return getValidUserName();

		} else {
			System.out.println("Kullanýcý adý en az iki karakter olmalýdýr. Mevcut durum : "
					+ customer.getUserFirstName().length());
			setValidUserName(false);
			return getValidUserName();
		}
	}

	public Boolean validPassWord(Customer customer) {

		if (customer.getUserPass().length() >= 6) {

			System.out.println("Þifre doðrulandý");
			setValidPassWord(true);
			return getValidPassWord();

		} else {
			System.out
					.println("Þifre en az altý karakter olmalýdýr. Mevcut durum : " + customer.getUserPass().length());

			setValidPassWord(false);
			return getValidPassWord();

		}

	}

	public Boolean validLastName(Customer customer) {

		if (customer.getUserLastName().length() >= 2) {
			System.out.println("Soyadý doðrulandý.");

			setValidLastName(true);
			return getValidLastName();

		} else {
			System.out.println("Kullanýcý soyadý en az iki karakter olmalýdýr");

			setValidLastName(false);
			return getValidLastName();
		}

	}

	public Boolean validEmail(Customer customer) {

		String regex = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(customer.getUserMail());

		if (matcher.matches()) {
			System.out.println("Email Kontrolü Saðlandý");
			setValidEmail(true);
			return getValidEmail();
		} else {
			System.out.println("Uygun olmayan E-mail tipi");
			setValidEmail(false);
			return getValidEmail();
		}

	}

}
