package Core;

import Entity.Concrete.Customer;

import java.util.Random;
import java.util.Scanner;

public class yilmazMailValidator implements MailService {

	@Override
	public Boolean register(Customer customer) {
		// TODO Auto-generated method stub
		Random randomOnay = new Random();
		int validatorNumber = randomOnay.nextInt(10000);
		System.out.println("|--------------Sistemimize Hoþ Geldiniz---------------|");
		System.out.println("|----------------*Sayýn Müþterimiz--------------------|");
		System.out.println("|Kullanýcý Adýnýz-----" + customer.getUserFirstName() + customer.getUserId()
				+ "-------------------------|");
		System.out.println("|Mail Adresiniz-------" + customer.getUserMail() + "----------------|");
		System.out.println("|Þifreniz-------------" + customer.getUserPass() + "-------------------------|");
		System.out.println("|Onay Metniniz--------==>" + validatorNumber + "-------------------------|");
		System.out.printf("Lütfen onay numarýnýzý giriniz =>>");
		Scanner input = new Scanner(System.in);

		int typedInt = input.nextInt();

		if (typedInt == validatorNumber) {

			System.out.println("|----Baþarýlý bir þekilde Kaydoldunuz---|");

			return true;
		} else {

			System.out.println("Hatalý  Girdi LÜtfen tekrar deneyimiz");
			return false;
		}

	}

	@Override
	public Boolean update(Customer customer) {
		// TODO Auto-generated method stub
		Random randomOnay = new Random();
		int validatorNumber = randomOnay.nextInt(10000);
		System.out.println("|--------------Sistemimize Hoþ Geldiniz---------------|");
		System.out.println("|-----------------Sayýn Müþterimiz--------------------|");
		System.out.println("|Kullanýcý Adýnýz-----" + customer.getUserFirstName() + customer.getUserId()
				+ "-------------------------|");
		System.out.println("|Mail Adresiniz-------" + customer.getUserMail() + "----------------|");
		System.out.println("|Þifreniz-------------" + customer.getUserPass() + "-------------------------|");
		System.out.println("|Onay Metniniz--------==>" + validatorNumber + "-------------------------|");
		System.out.printf("Lütfen onay numarýnýzý giriniz =>>");
		Scanner input = new Scanner(System.in);

		int typedInt = input.nextInt();

		if (typedInt == validatorNumber) {

			System.out.println("|----Baþarýlý bir þekilde Güncellendiniz---|");

			return true;
		} else {

			System.out.println("Hatalý  Girdi LÜtfen tekrar deneyimiz");
			return false;
		}
	}

	@Override
	public Boolean delete(Customer customer) {
		// TODO Auto-generated method stub
		Random randomOnay = new Random();
		int validatorNumber = randomOnay.nextInt(10000);
		System.out.println("|--------------Sistemimize Hoþ Geldiniz---------------|");

		System.out.printf("Lütfen onay numarýnýzý giriniz =>>");
		Scanner input = new Scanner(System.in);

		int typedInt = input.nextInt();

		if (typedInt == validatorNumber) {

			System.out.println("|----Baþarýlý bir þekilde Sistemden Silindiniz---|");

			return true;
		} else {

			System.out.println("Hatalý  Girdi LÜtfen tekrar deneyimiz");
			return false;
		}
	}

}
