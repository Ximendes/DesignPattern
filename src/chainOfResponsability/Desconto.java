package chainOfResponsability;

import strategyImposto.Orcamento;

public interface Desconto {

	double desconta(Orcamento orcamento);

	void setProximo(Desconto desconto);
}
