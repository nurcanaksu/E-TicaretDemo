package eTicaretDemo.dataAccess.concretes;

import eTicaretDemo.dataAccess.abstracts.UserDao;
import eTicaretDemo.entities.concretes.User;

public class NormalLoginDao implements UserDao {

	@Override
	public void signUp(User user) {

       System.out.println(user.getAd() + "Adl� kullan�c� Normal bir �ekilde sisteme kay�t oldu");
	}

}
