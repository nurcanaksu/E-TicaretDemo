package eTicaretDemo.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTicaretDemo.business.abstracts.UserService;
import eTicaretDemo.core.DogrulamaManager;
import eTicaretDemo.dataAccess.abstracts.UserDao;
import eTicaretDemo.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao usedao;
	private DogrulamaManager dogrulamaService;
	

	public UserManager(UserDao usedao,DogrulamaManager dogrulamaService) {
		super();
		this.usedao = usedao;
		this.dogrulamaService=dogrulamaService;
	}

	@Override
	public void login(User user) {

		if (user.getEposta().length() == 0) {
			System.out.println("L�tfen e-posta alan�n� bo� b�rakmay�n�z");
		} else if(user.getParola().length() ==0) {
			System.out.println("Parola en az 6 karakterden olu�mal�d�r.");
		}else
			System.out.println(user.getAd() + " Adl� Kullan�c� sisteme giri� yapt�");
	}

	public boolean epostaDogrulama(String message) {
		String regex = "^(.+)@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(message);
		return matcher.matches();
	}

	@Override
	public void signup(User user) {

		if (user.getAd().length() < 2 && user.getSoyad().length() < 2) {
			System.out.println("Kullan�c� ad� ve soyad� en az iki karakterden olu�mal�d�r.");
		} else if (user.getParola().length() < 6) {
			System.out.println("Parola en az 6 karakterden olu�mal�d�r.");
		} else if (epostaDogrulama(user.getEposta()) == false) {
			System.out.println("L�tfen e-posta format�nda yaz�n�z");
		} else
			this.usedao.signUp(user);
		    this.dogrulamaService.dogrula("�yelik tamamland� do�rulamak i�in t�klay�n�z");
	}

}
