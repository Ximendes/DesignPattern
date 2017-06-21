package ObserverExemploInternet;

public class Newspaper implements Observer {

	@Override
	public void update(float interest) {
		System.out.println("Jornal: Taxa de juros atualizada, nova taxa é: " + interest);
	}
}
