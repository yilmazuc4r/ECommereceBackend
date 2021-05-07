package Core;

import Entity.Concrete.Customer;

public interface MailService {
	Boolean register(Customer customer);

	Boolean update(Customer customer);

	Boolean delete(Customer customer);
}
