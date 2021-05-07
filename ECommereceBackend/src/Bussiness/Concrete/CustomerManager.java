package Bussiness.Concrete;

import Entity.Concrete.Customer;
import java.util.List;

import Bussiness.Abstracts.CustomerService;
import Core.MailService;
import Core.ValidationService;
import DataAccess.Abstracts.ProductDao;

public class CustomerManager implements CustomerService {

	private ProductDao productDao;
	private ValidationService validator;
	private MailService mailService;

	public CustomerManager(ProductDao productDao, ValidationService validator, MailService mailService) {
		super();
		this.productDao = productDao;
		this.validator = validator;
		this.mailService = mailService;
	}

	@Override
	public void add(Customer customer) {
		// TODO Auto-generated method stub
		if (validator.validUserName(customer) && validator.validLastName(customer) && validator.validPassWord(customer)
				&& validator.validEmail(customer)) {

			if (mailService.register(customer)) {
				productDao.add(customer);
			} else {
				System.out.println("Kat�t yap�lmad�");
			}

		} else {
			System.out.println("L�tfen do�ru bilgi giri�i sa�lay�n�z");
		}
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		if (validator.validUserName(customer) && validator.validLastName(customer) && validator.validPassWord(customer)
				&& validator.validEmail(customer)) {

			if (mailService.update(customer)) {
				productDao.update(customer);
			} else {
				System.out.println("Kay�t G�ncellenemedi");
			}

		} else {
			System.out.println("L�tfen do�ru bilgi giri�i sa�lay�n�z");
		}
	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Kullanc� Silindi");

	}

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
