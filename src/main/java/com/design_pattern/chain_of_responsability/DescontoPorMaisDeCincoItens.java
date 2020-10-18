package com.design_pattern.chain_of_responsability;

import com.design_pattern.strategy_imposto.Orcamento;

public class DescontoPorMaisDeCincoItens implements Desconto {

	private Desconto proximo;

	public double desconta(Orcamento orcamento) {
		if (orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.1;
		}
		return proximo.desconta(orcamento);
	}

	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}
}
