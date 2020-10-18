package com.design_pattern.state;

import com.design_pattern.strategy_imposto.Orcamento;

public class EmAprovacao implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.valor -= orcamento.valor * 0.05;
	}

	public void aprova(Orcamento orcamento) {
		// desse estado posso ir para o estado de aprovado
		orcamento.estadoAtual = StatusOrcamento.APROVADO;
	}

	public void reprova(Orcamento orcamento) {
		// desse estado posso ir para o estado de reprovado tambem
		orcamento.estadoAtual = StatusOrcamento.REPROVADO;
	}

	public void finaliza(Orcamento orcamento) {
		// daqui não posso ir direto para finalizado
		throw new RuntimeException("Orcamento em aprovação não podem ir para finalizado diretamente");
	}

}
