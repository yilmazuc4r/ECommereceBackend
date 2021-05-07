package Bussiness.Abstracts;

import java.util.List;

import Entity.Concrete.Customer;

public interface CustomerService {
	void add(Customer customer);
	

	void update(Customer customer);

	void delete(Customer customer);

	List<Customer> getAll();

}
