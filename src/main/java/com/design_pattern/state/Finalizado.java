package com.design_pattern.state;


import com.design_pattern.strategy_imposto.Orcamento;

public class Finalizado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos finalizados não recebem desconto extra!");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamentos finalizados não podem ser aprovados");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("orcamentos finalizados não pode sem reprovados");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já finalizados");
	}
}
