package DataAccess.Concrete;

import Entity.Concrete.Customer;
import java.util.List;

import DataAccess.Abstracts.ProductDao;

public class HibarNateSave implements ProductDao {

	@Override
	public void add(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Hibar nate db'ye Eklendi");
		System.out.println("----------------------------------------------");
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Hibar nate ile db'den güncellendi");
		System.out.println("----------------------------------------------");
	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Hibar nate db'den silindi");
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
