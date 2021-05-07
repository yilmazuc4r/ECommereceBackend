package DataAccess.Concrete;

import java.util.List;

import DataAccess.Abstracts.ProductDao;

import Entity.Concrete.Customer;

public class LocalDB implements ProductDao {

	@Override
	public void add(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Yerel Sunucuya Ba�ar�l� ile kaydedildi");
		System.out.println("----------------------------------------------");
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Yerel Sunucuya Ba�ar�l� ile g�ncellendi");
		System.out.println("----------------------------------------------");
	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Yerel Sunucuya Ba�ar�l� ile silindi");
		System.out.println("----------------------------------------------");
	}

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void get(int id) {
		// TODO Auto-generated method stub

	}

}
