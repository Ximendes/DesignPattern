package com.design_pattern.chain_of_responsability;

import com.design_pattern.strategy_imposto.Orcamento;

public interface Desconto {

	double desconta(Orcamento orcamento);

	void setProximo(Desconto desconto);
}
