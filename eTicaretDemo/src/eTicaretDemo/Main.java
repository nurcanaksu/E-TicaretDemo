package eTicaretDemo;

import eTicaretDemo.business.concretes.UserManager;
import eTicaretDemo.core.DogrulamaManager;
import eTicaretDemo.dataAccess.concretes.LoginWithGoogle;
import eTicaretDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		User user = new User();
		user.setAd("Nurcan");
		user.setSoyad("Aksu");
		user.setEposta("nurcan.aksuf@gmail.com");
		user.setParola("6532552");

		UserManager userManager = new UserManager(new LoginWithGoogle(), new DogrulamaManager());
		userManager.signup(user);

		UserManager userManager1 = new UserManager(new LoginWithGoogle(), new DogrulamaManager());
		userManager1.login(user);

	}

}
