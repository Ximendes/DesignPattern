package ChainOfResponsabilityBanco;

public class SemResposta implements Resposta {

	@Override
	public void responde(Requisicao req, Conta conta) {
		System.out.println(conta.getTitular() + conta.getSaldo());
	}

	@Override
	public void setProxima(Resposta resposta) {
		// Sem proximo!!
	}

}
