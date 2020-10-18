package com.design_pattern.strategy_imposto;

public class CalculadoraDeImpostos {

	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
		double valor = imposto.calcula(orcamento);
		System.out.println(valor);
	}

}