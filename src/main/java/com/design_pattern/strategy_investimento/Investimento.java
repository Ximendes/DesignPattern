package com.design_pattern.strategy_investimento;

public interface Investimento {

	double aplica(Conta conta);

	default double retornaLucro(double lucro) {
		return lucro * 0.75;
	}
}
