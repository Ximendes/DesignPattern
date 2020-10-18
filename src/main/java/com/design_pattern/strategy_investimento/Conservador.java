package com.design_pattern.strategy_investimento;

public class Conservador implements Investimento {

	@Override
	public double aplica(Conta conta) {
		return retornaLucro(conta.getSaldo() * 0.008);
	}
}
