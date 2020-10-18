package com.design_pattern.chain_of_responsability_bank;

public class Requisicao {

	private Formato formato;

	public Requisicao(Formato formato) {
		super();
		this.formato = formato;
	}

	public Formato getFormato() {
		return formato;
	}

	public void setFormato(Formato formato) {
		this.formato = formato;
	}

}
