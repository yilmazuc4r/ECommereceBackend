package DataAccess.Abstracts;
import Entity.Concrete.Customer;

import java.util.List;



public interface ProductDao {

	void add(Customer customer);

	void update(Customer customer);

	void delete(Customer customer);
	
	List<Customer> getAll();
	
	void get(int id);
	
}
