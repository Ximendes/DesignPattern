package ChainOfResponsabilityBanco;

public class TestaFormato {

	public static void main(String[] args) {

		Conta conta = new Conta("Juca", 1000.0);
		Requisicao reqCsv = new Requisicao(Formato.PDF);
		AplicaFormato aplica = new AplicaFormato();

		aplica.aplica(reqCsv, conta);
	}
}
