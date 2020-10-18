package com.design_pattern.chain_of_responsability_bank;

public class UsarFormato {

	public static void aplicar() {

		Conta conta = new Conta("Juca", 1000.0);
		Requisicao reqCsv = new Requisicao(Formato.PDF);
		AplicaFormato aplica = new AplicaFormato();

		aplica.aplica(reqCsv, conta);
	}
}
