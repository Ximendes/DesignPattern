package com.design_pattern.chain_of_responsability;

import com.design_pattern.strategy_imposto.Orcamento;

public class SemDesconto implements Desconto {

	@Override
	public double desconta(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximo(Desconto desconto) {
		//Não tem!!
	}

}
