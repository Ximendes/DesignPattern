package ChainOfResponsabilityBanco;

public class RespostaEmCsv implements Resposta {

	private Resposta resposta;

	@Override
	public void responde(Requisicao req, Conta conta) {
		if (Formato.CSV.equals(req.getFormato())) {
			System.out.println(conta.getTitular() + "," + conta.getSaldo());
		} else {
			resposta.responde(req, conta);
		}
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.resposta = resposta;

	}

}
