package Core;

import Entity.Concrete.Customer;

public interface ValidationService {
	Boolean validUserName(Customer customer);

	Boolean validPassWord(Customer customer);

	Boolean validLastName(Customer customer);

	Boolean validEmail(Customer customer);
	

}
