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
		System.out.println("|--------------Sistemimize Ho� Geldiniz---------------|");
		System.out.println("|----------------*Say�n M��terimiz--------------------|");
		System.out.println("|Kullan�c� Ad�n�z-----" + customer.getUserFirstName() + customer.getUserId()
				+ "-------------------------|");
		System.out.println("|Mail Adresiniz-------" + customer.getUserMail() + "----------------|");
		System.out.println("|�ifreniz-------------" + customer.getUserPass() + "-------------------------|");
		System.out.println("|Onay Metniniz--------==>" + validatorNumber + "-------------------------|");
		System.out.printf("L�tfen onay numar�n�z� giriniz =>>");
		Scanner input = new Scanner(System.in);

		int typedInt = input.nextInt();

		if (typedInt == validatorNumber) {

			System.out.println("|----Ba�ar�l� bir �ekilde Kaydoldunuz---|");

			return true;
		} else {

			System.out.println("Hatal�  Girdi L�tfen tekrar deneyimiz");
			return false;
		}

	}

	@Override
	public Boolean update(Customer customer) {
		// TODO Auto-generated method stub
		Random randomOnay = new Random();
		int validatorNumber = randomOnay.nextInt(10000);
		System.out.println("|--------------Sistemimize Ho� Geldiniz---------------|");
		System.out.println("|-----------------Say�n M��terimiz--------------------|");
		System.out.println("|Kullan�c� Ad�n�z-----" + customer.getUserFirstName() + customer.getUserId()
				+ "-------------------------|");
		System.out.println("|Mail Adresiniz-------" + customer.getUserMail() + "----------------|");
		System.out.println("|�ifreniz-------------" + customer.getUserPass() + "-------------------------|");
		System.out.println("|Onay Metniniz--------==>" + validatorNumber + "-------------------------|");
		System.out.printf("L�tfen onay numar�n�z� giriniz =>>");
		Scanner input = new Scanner(System.in);

		int typedInt = input.nextInt();

		if (typedInt == validatorNumber) {

			System.out.println("|----Ba�ar�l� bir �ekilde G�ncellendiniz---|");

			return true;
		} else {

			System.out.println("Hatal�  Girdi L�tfen tekrar deneyimiz");
			return false;
		}
	}

	@Override
	public Boolean delete(Customer customer) {
		// TODO Auto-generated method stub
		Random randomOnay = new Random();
		int validatorNumber = randomOnay.nextInt(10000);
		System.out.println("|--------------Sistemimize Ho� Geldiniz---------------|");

		System.out.printf("L�tfen onay numar�n�z� giriniz =>>");
		Scanner input = new Scanner(System.in);

		int typedInt = input.nextInt();

		if (typedInt == validatorNumber) {

			System.out.println("|----Ba�ar�l� bir �ekilde Sistemden Silindiniz---|");

			return true;
		} else {

			System.out.println("Hatal�  Girdi L�tfen tekrar deneyimiz");
			return false;
		}
	}

}
