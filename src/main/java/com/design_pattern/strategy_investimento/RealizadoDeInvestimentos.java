package com.design_pattern.strategy_investimento;

public class RealizadoDeInvestimentos {

	public void investe(Conta conta, Investimento investimento) {
		double lucro = investimento.aplica(conta);
		conta.deposita(lucro);
		System.out.println("titular:" + conta.getTitular() + "-" + "saldo:" + conta.getSaldo());
	}

}
