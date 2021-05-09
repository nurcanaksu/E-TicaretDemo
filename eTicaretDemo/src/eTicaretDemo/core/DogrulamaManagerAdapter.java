package eTicaretDemo.core;



public class DogrulamaManagerAdapter implements DogrulamaService{

	@Override
	public void dogrula(String message) {
        DogrulamaManager dogrulamaManager = new DogrulamaManager();
        dogrulamaManager.dogrula(message);
		
	}

}
