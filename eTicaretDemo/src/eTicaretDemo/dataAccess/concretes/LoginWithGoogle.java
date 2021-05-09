package eTicaretDemo.dataAccess.concretes;

import eTicaretDemo.dataAccess.abstracts.UserDao;
import eTicaretDemo.entities.concretes.User;

public class LoginWithGoogle implements UserDao {

	@Override
	public void signUp(User user) {
		System.out.println(user.getAd() + " Adlý kullanýcý Google servis ile kayýt oldu");

	}
}
