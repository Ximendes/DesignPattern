package com.design_pattern.chain_of_responsability_bank;

public class RespostaEmXml implements Resposta {

	private Resposta resposta;

	@Override
	public String responde(Requisicao req, Conta conta) {
		if (Formato.XML.equals(req.getFormato())) {
			return "<conta>" +
						"<titular>" +
							conta.getTitular() +
						"</titular>" +
						"<saldo>"+
							conta.getSaldo() +
						"</saldo>" +
					"</conta>";
		} else {
			return resposta.responde(req, conta);
		}
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.resposta = resposta;
	}

}
