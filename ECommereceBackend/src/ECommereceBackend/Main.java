package ECommereceBackend;

import Bussiness.Concrete.CustomerManager;
import Core.yilmazMailValidator;
import Core.yilmazValidator;
import Core.Adapters.googleManagerAdapter;
import DataAccess.Concrete.LocalDB;
import Entity.Concrete.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Customer customer1 = new Customer(1, "Yýlmaz", "uçar", "yilmaz@gamil.com", "Þifre11");

		CustomerManager customerManager = new CustomerManager(new LocalDB(), new yilmazValidator(),
				new yilmazMailValidator());
		 //customerManager.add(customer1);
		customerManager.update(customer1);
		googleManagerAdapter googlemanageradapter = new googleManagerAdapter();

		// googlemanageradapter.register("maildar", "User");
	}

}
