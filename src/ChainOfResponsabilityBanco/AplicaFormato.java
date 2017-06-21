package ChainOfResponsabilityBanco;

public class AplicaFormato {

	public void aplica(Requisicao req, Conta conta) {

		RespostaEmXml xml = new RespostaEmXml();
		RespostaEmCsv csv = new RespostaEmCsv();
		RespostaEmPorcento porcento = new RespostaEmPorcento();
		SemResposta semResposta = new SemResposta();

		xml.setProxima(csv);
		csv.setProxima(porcento);
		porcento.setProxima(semResposta);

		xml.responde(req, conta);
	}
}
