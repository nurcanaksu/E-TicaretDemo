package eTicaretDemo.dataAccess.concretes;

import eTicaretDemo.dataAccess.abstracts.UserDao;
import eTicaretDemo.entities.concretes.User;

public class LoginWithGoogle implements UserDao {

	@Override
	public void signUp(User user) {
		System.out.println(user.getAd() + " Adl� kullan�c� Google servis ile kay�t oldu");

	}
}
