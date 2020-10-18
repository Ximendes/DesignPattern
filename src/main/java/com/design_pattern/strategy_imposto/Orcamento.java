package com.design_pattern.strategy_imposto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.design_pattern.state.StatusOrcamento;
import com.design_pattern.chain_of_responsability.Item;

public class Orcamento {

	public double valor;
	private List<Item> itens;

	public StatusOrcamento estadoAtual;

	public Orcamento(double valor) {
		this.valor = valor;
		this.itens = new ArrayList<Item>();
		this.estadoAtual = StatusOrcamento.EM_APROVACAO;
	}

	public double getValor() {
		return valor;
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}

	public void adicionaItem(Item item) {
		itens.add(item);
	}

	public void aplicaDescontoExtra() {
		estadoAtual.getEstado().aplicaDescontoExtra(this);
	}

	public void aprova() {
		estadoAtual.getEstado().aprova(this);
	}

	public void reprova() {
		estadoAtual.getEstado().reprova(this);
	}

	public void finaliza() {
		estadoAtual.getEstado().finaliza(this);
	}

}
