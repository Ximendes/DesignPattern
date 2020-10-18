package com.design_pattern.chain_of_responsability_bank;

public class RespostaEmPorcento implements Resposta {

	private Resposta resposta;

	@Override
	public String responde(Requisicao req, Conta conta) {
		if (Formato.PORCENTO.equals(req.getFormato())) {
			return conta.getTitular() + "%" + conta.getSaldo();
		} else {
			return resposta.responde(req, conta);
		}
	}

	@Override
	public void setProxima(Resposta resposta) {
		this.resposta = resposta;
	}
}
