package com.design_pattern.strategy_investimento;

import java.util.Random;

public class Moderado implements Investimento {

	private Random random;

	public Moderado() {
		this.random = new Random();
	}

	@Override
	public double aplica(Conta conta) {
		if (random.nextInt(2) == 0) {
			return retornaLucro(conta.getSaldo() * 0.025);
		} else {
			return retornaLucro(conta.getSaldo() * 0.007);
		}
	}
}
