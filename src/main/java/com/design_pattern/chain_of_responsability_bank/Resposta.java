package com.design_pattern.chain_of_responsability_bank;

public interface Resposta {

	void responde(Requisicao req, Conta conta);

	void setProxima(Resposta resposta);

}
