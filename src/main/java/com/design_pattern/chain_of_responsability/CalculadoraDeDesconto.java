package com.design_pattern.chain_of_responsability;

import com.design_pattern.strategy_imposto.Orcamento;

public class CalculadoraDeDesconto {

	public double calcula(Orcamento orcamento) {

		Desconto descontoPorMaisDeCincoItens = new DescontoPorMaisDeCincoItens();
		Desconto descontoPorMaisDeQuinhentosReais = new DescontoPorMaisDeQuinhentosReais();
		Desconto descontoPorVendaCasada = new DescontoPorVendaCasada();
		Desconto semDesconto = new SemDesconto();

		descontoPorMaisDeCincoItens.setProximo(descontoPorMaisDeQuinhentosReais);
		descontoPorMaisDeQuinhentosReais.setProximo(descontoPorVendaCasada);
		descontoPorVendaCasada.setProximo(semDesconto);

		return descontoPorMaisDeCincoItens.desconta(orcamento);
	}
}
