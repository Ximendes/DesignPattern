package com.design_pattern.state;

public enum StatusOrcamento {

	EM_APROVACAO(new EmAprovacao()), APROVADO(new Aprovado()), REPROVADO(new Reprovado()), FINALIZADO(new Finalizado());

	private EstadoDeUmOrcamento estado;

	private StatusOrcamento(EstadoDeUmOrcamento estado) {
		this.estado = estado;
	}

	public EstadoDeUmOrcamento getEstado() {
		return estado;
	}

}
